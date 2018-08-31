package com.jonathan.log.element;

public abstract class Element {

    private String tagString;

    public Element(String tagString) {
        this.setTagString(tagString);
    }

    private void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public abstract String getTagString();

}
