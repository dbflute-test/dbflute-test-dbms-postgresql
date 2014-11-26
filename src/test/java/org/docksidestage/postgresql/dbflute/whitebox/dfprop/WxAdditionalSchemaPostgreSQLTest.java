package org.docksidestage.postgresql.dbflute.whitebox.dfprop;

import java.util.List;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.helper.HandyDate;
import org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.postgresql.dbflute.cbean.NextschemaWhiteSameNameCB;
import org.docksidestage.postgresql.dbflute.cbean.NextschemaWhiteSameNameRefCB;
import org.docksidestage.postgresql.dbflute.cbean.WhiteSameNameCB;
import org.docksidestage.postgresql.dbflute.exbhv.NextschemaWhiteSameNameBhv;
import org.docksidestage.postgresql.dbflute.exbhv.NextschemaWhiteSameNameRefBhv;
import org.docksidestage.postgresql.dbflute.exbhv.WhiteSameNameBhv;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpNextNoParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpReturnParameterPmb;
import org.docksidestage.postgresql.dbflute.exentity.NextschemaWhiteSameName;
import org.docksidestage.postgresql.dbflute.exentity.NextschemaWhiteSameNameRef;
import org.docksidestage.postgresql.dbflute.exentity.WhiteSameName;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.8 (2010/04/18 Sunday)
 */
public class WxAdditionalSchemaPostgreSQLTest extends UnitContainerTestCase {

    private WhiteSameNameBhv whiteSameNameBhv;
    private NextschemaWhiteSameNameBhv nextschemaWhiteSameNameBhv;
    private NextschemaWhiteSameNameRefBhv nextschemaWhiteSameNameRefBhv;

    // ===================================================================================
    //                                                                      SqlName Prefix
    //                                                                      ==============
    public void test_SqlNamePrefix_table() {
        assertFalse(MemberDbm.getInstance().getTableSqlName().toString().contains("."));
    }

    public void test_SqlNamePrefix_procedure() {
        assertFalse(new SpReturnParameterPmb().getProcedureName().contains("."));
        assertTrue(new SpNextNoParameterPmb().getProcedureName().contains("."));
    }

    // ===================================================================================
    //                                                                       SameNameTable
    //                                                                       =============
    public void test_SameNameTable_main_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteSameNameCB cb = new WhiteSameNameCB();

        // ## Act ##
        ListResultBean<WhiteSameName> mainList = whiteSameNameBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteSameName main : mainList) {
            log(main);
            assertNotNull(main.getSameNameName());
            assertNotNull(main.getSameNameInteger());
        }
    }

    public void test_SameNameTable_main_nextBridge() {
        // ## Arrange ##
        registerTestData();
        WhiteSameNameCB cb = new WhiteSameNameCB();
        cb.setupSelect_NextSchemaProduct();

        // ## Act ##
        ListResultBean<WhiteSameName> mainList = whiteSameNameBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteSameName main : mainList) {
            assertNotNull(main.getNextSchemaProduct());
        }
    }

    public void test_SameNameTable_next_LoadReferrer() {
        // ## Arrange ##
        registerTestData();
        NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();

        // ## Act ##
        ListResultBean<NextschemaWhiteSameName> mainList = nextschemaWhiteSameNameBhv.selectList(cb);
        nextschemaWhiteSameNameBhv.loadWhiteSameNameRef(mainList, new ConditionBeanSetupper<NextschemaWhiteSameNameRefCB>() {
            public void setup(NextschemaWhiteSameNameRefCB cb) {
                cb.setupSelect_WhiteSameName();
            }
        });

        // ## Assert ##
        assertHasAnyElement(mainList); // expect no exception for now
        for (NextschemaWhiteSameName main : mainList) {
            List<NextschemaWhiteSameNameRef> refList = main.getWhiteSameNameRefList();
            assertHasAnyElement(refList);
        }
    }

    public void test_SameNameTable_next_SetupSelect() {
        // ## Arrange ##
        registerTestData();
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
        cb.setupSelect_WhiteSameName();

        // ## Act ##
        ListResultBean<NextschemaWhiteSameNameRef> refList = nextschemaWhiteSameNameRefBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        for (NextschemaWhiteSameNameRef ref : refList) {
            assertNotNull(ref.getWhiteSameName());
        }
    }

    protected void registerTestData() {
        {
            WhiteSameName main = new WhiteSameName();
            main.setSameNameId(1L);
            main.setSameNameName("main1");
            main.setSameNameInteger(123546);
            main.setNextSchemaProductId(1);
            whiteSameNameBhv.insert(main);
        }
        {
            NextschemaWhiteSameName main = new NextschemaWhiteSameName();
            main.setSameNameId(101);
            main.setSameNameName("nextmain1");
            main.setSameNameLong(456789L);
            nextschemaWhiteSameNameBhv.insert(main);
        }
        {
            NextschemaWhiteSameNameRef ref = new NextschemaWhiteSameNameRef();
            ref.setSameNameRefId(111L);
            ref.setSameNameId(101);
            ref.setNextRefDate(new HandyDate("2013/07/06").getLocalDate());
            nextschemaWhiteSameNameRefBhv.insert(ref);
        }
    }
}