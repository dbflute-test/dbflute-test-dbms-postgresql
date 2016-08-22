package org.docksidestage.postgresql.mytype.valuetype;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.dbflute.s2dao.valuetype.TnAbstractValueType;
import org.docksidestage.postgresql.mytype.MyJSON;

/**
 * Simple example of extending JSON Type.
 * @author jflute
 */
public class MyTypeOfJSON extends TnAbstractValueType {

    public MyTypeOfJSON() {
        super(Types.OTHER);
    }

    public Object getValue(ResultSet resultSet, int index) throws SQLException {
        String jsonString = resultSet.getString(index);
        return jsonString != null ? new MyJSON().setup(jsonString) : null;
    }

    public Object getValue(ResultSet resultSet, String columnName) throws SQLException {
        String jsonString = resultSet.getString(columnName);
        return jsonString != null ? new MyJSON().setup(jsonString) : null;
    }

    public Object getValue(CallableStatement cs, int index) throws SQLException {
        String jsonString = cs.getString(index);
        return jsonString != null ? new MyJSON().setup(jsonString) : null;
    }

    public Object getValue(CallableStatement cs, String parameterName) throws SQLException {
        String jsonString = cs.getString(parameterName);
        return jsonString != null ? new MyJSON().setup(jsonString) : null;
    }

    public void bindValue(Connection conn, PreparedStatement ps, int index, Object value) throws SQLException {
        if (value == null) {
            setNull(ps, index);
        } else {
            ps.setObject(index, value, Types.OTHER);
        }
    }

    public void bindValue(Connection conn, CallableStatement cs, String parameterName, Object value) throws SQLException {
        if (value == null) {
            setNull(cs, parameterName);
        } else {
            cs.setObject(parameterName, value, Types.OTHER);
        }
    }
}
