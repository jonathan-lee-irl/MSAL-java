package com.jonathan.log;

import com.jonathan.log.element.PrimaryElement;

public class Log extends PrimaryElement {

    private static final String tagString;

    static {
        tagString = "log";
    }

    public Log() {
        super(Log.tagString);
    }

    @Override
    public String getTagString() {
        return Log.tagString;
    }

}
