package com.jonathan.log.alteration;

public class GeneralAlteration extends Alteration {

    private static final String tagString;

    static {
        tagString = "alteration";
    }

    @Override
    public String getTagString() {
        return GeneralAlteration.tagString;
    }

}
