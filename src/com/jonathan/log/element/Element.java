package com.jonathan.log.element;

import java.util.ArrayList;

public abstract class Element {

    // TODO Implement protected member or class which allows for storage of metadata e.g. category="networking"

    protected ArrayList<Attirbute> attirbuteArrayList;

    class Attirbute {

        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

    public abstract String getTagString();

}
