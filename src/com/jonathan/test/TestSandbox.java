package com.jonathan.test;

import com.jonathan.log.Log;
import com.jonathan.log.alteration.Installation;

public class TestSandbox {

    public static void main(String[] args) {
        Log log = new Log();
        System.out.println(log.getTagString());

        Installation installation = new Installation();
        System.out.println(installation.getTagString());
    }

}
