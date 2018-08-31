package com.jonathan.log.insert;

import com.jonathan.log.element.BasicElement;

public class Todo extends BasicElement {

    private static final String tagString;

    static {
        tagString = "TODO";
    }

    @Override
    public String getTagString() {
        return Todo.tagString;
    }

}
