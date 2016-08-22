package org.docksidestage.postgresql.mytype;

/**
 * Simple example of extending XML Type.
 * @author jflute
 */
public class MyXML {

    protected String xmlString;

    public MyXML setup(String xmlString) {
        this.xmlString = xmlString;
        return this;
    }

    public String getXmlString() {
        return xmlString;
    }

    @Override
    public String toString() {
        return xmlString != null ? xmlString : "<empty />";
    }
}
