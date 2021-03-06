package org.docksidestage.postgresql.mytype;

/**
 * Simple example of extending Array Type.
 * @author jflute
 */
public class MyArray {

    protected String arrayString;

    public MyArray setup(String arrayString) {
        this.arrayString = arrayString;
        return this;
    }

    public String getArrayString() {
        return arrayString;
    }

    @Override
    public String toString() {
        return arrayString != null ? arrayString : "{}";
    }
}
