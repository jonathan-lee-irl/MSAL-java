package com.jonathan.log.insert;

import com.jonathan.log.element.BasicElement;

public class Note extends BasicElement {

    private static final String tagString = "note";

    @Override
    public String getTagString() {
        return Note.tagString;
    }

}
