package com.jonathan.log.element;

import java.util.ArrayList;

public abstract class PrimaryElement extends Element {

    protected ArrayList<Element> elementArrayList;

    public PrimaryElement() {
        this.elementArrayList = new ArrayList<>();
    }

}
