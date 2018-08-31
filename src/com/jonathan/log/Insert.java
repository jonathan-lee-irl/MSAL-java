package com.jonathan.log;

import com.jonathan.log.element.BasicElement;

public class Insert extends BasicElement {

    private static final String tagString;

    static {
        tagString = "insert";
    }

    public Insert() {
        super(Insert.tagString);
    }

    public String getTagString() {
        return Insert.tagString;
    }

}
