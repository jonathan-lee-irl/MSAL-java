package com.jonathan.log.element;

import java.util.ArrayList;

public abstract class PrimaryElement extends Element {

    private ArrayList<Element> elementArrayList;

    public PrimaryElement(String tagString) {
        super(tagString);
    }

}
