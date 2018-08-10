package com.jonathan;

import com.jonathan.alteration.Alteration;
import com.jonathan.alteration.Log;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    Log log = new Log();

	    log.addAlteration(new Alteration());
	    log.addAlteration(new Alteration());

        Iterator<Alteration> listIterator = log.getAlterationArrayListIterator();

        while (listIterator.hasNext()) {
            Alteration next = listIterator.next();
            System.out.println(next);
            System.out.println("Removed: "+log.removeAlteration(next));
        }
    }
}
