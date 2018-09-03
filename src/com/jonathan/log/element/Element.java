package com.jonathan.log.element;

import java.util.ArrayList;

// TODO Change documentation, naming, and structure slightly in order to more closely tie to resulting XML file
/***
 * Represents any 'Element' which can be part of a log. Not to be confused with an XML element.
 * Also allows for easier translation in to an XML element, including the inner class Attribute.
 * and including the abstract getTagString() method for the resulting XML tag.
 */
public abstract class Element {

    // TODO Implement protected member or class which allows for storage of metadata e.g. category="networking"

    /**
     * Represents the name of the tag in resulting XML file
     */
    protected String tagString;

    /**
     * All of the attributes for the Element, empty list implies none
     */
    protected ArrayList<Attribute> attributeArrayList;

    /**
     * Returns the String which is the name of the resulting XML tag for the element
     * @return the name of the tag in the resulting XML element
     */
    public abstract String getTagString();

    /**
     * Represents an attribute which will be used in a resulting XML element
     */
    class Attribute {

        /**
         * Name of the attribute
         */
        private String name;
        /**
         * Value of the attribute
         */
        private String value;

        /*
         * Getters and Setters
         */

        /**
         * Basic getter for the name of the attribute
         * @return name of the attribute
         */
        public String getName() {
            return name;
        }

        /**
         * Basic setter for the name of the attribute
         * @param name String which will be used as the attribute's name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Basic getter for the value of the attribute
         * @return the value of the attribute
         */
        public String getValue() {
            return value;
        }

        /**
         * Basic setter for the value of the attribute
         * @param value String which will be used as the attribute's value
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
