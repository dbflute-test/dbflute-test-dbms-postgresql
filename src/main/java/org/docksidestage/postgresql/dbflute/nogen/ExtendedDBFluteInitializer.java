package org.docksidestage.postgresql.dbflute.nogen;

import javax.sql.DataSource;

import org.docksidestage.postgresql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.postgresql.dbflute.allcommon.DBFluteInitializer;
import org.docksidestage.postgresql.mytype.MyArray;
import org.docksidestage.postgresql.mytype.MyXML;
import org.docksidestage.postgresql.mytype.valuetype.MyTypeOfArray;
import org.docksidestage.postgresql.mytype.valuetype.MyTypeOfXML;

/**
 * @author jflute
 */
public class ExtendedDBFluteInitializer extends DBFluteInitializer {

    public ExtendedDBFluteInitializer(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void prologue() {
        super.prologue();

        DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();
        config.registerBasicValueType(MyArray.class, new MyTypeOfArray());
        config.registerBasicValueType(MyXML.class, new MyTypeOfXML());
        config.lock();
    }
}
