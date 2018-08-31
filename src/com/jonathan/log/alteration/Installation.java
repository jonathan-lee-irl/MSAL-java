package com.jonathan.log.alteration;

public class Installation extends Alteration {

    private static final String tagString;

    static {
        tagString = "installation";
    }

    public Installation() {
    }

    @Override
    public String getTagString() {
        return Installation.tagString;
    }
}
