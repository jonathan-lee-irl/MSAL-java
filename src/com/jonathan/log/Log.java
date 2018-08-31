package com.jonathan.log;

import com.jonathan.log.element.Element;
import com.jonathan.log.element.PrimaryElement;

public class Log extends PrimaryElement {

    private static final String tagString;

    static {
        tagString = "log";
    }

    // INSERTED AS A TESTER
    public boolean addElement(Element element) {
        return this.elementArrayList.add(element);
    }

    @Override
    public String getTagString() {
        return Log.tagString;
    }

}
