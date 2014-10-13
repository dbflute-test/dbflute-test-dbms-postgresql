package org.docksidestage.postgresql.dbflute.exbhv.cursor;

import java.sql.SQLException;

import org.docksidestage.postgresql.mytype.MyArray;
import org.docksidestage.postgresql.mytype.valuetype.MyTypeOfArray;

/**
 * The cursor of VendorCheckCursor.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCursorCursor extends org.docksidestage.postgresql.dbflute.bsbhv.cursor.BsVendorCheckCursorCursor {
    
    protected MyTypeOfArray _arrayType = new MyTypeOfArray();
    
    @Override
    public MyArray getTypeOfVcArray() throws SQLException {
        return (MyArray)_arrayType.getValue(_rs, "type_of_vc_array");
    }
}
