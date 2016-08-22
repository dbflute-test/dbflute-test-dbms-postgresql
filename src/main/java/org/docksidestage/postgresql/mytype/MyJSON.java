package org.docksidestage.postgresql.mytype;

/**
 * Simple example of extending JSON Type.
 * @author jflute
 */
public class MyJSON {

    protected String jsonString;

    public MyJSON setup(String jsonString) {
        this.jsonString = jsonString;
        return this;
    }

    public String getJsonString() {
        return jsonString;
    }

    @Override
    public String toString() {
        return jsonString != null ? jsonString : "{}";
    }
}
