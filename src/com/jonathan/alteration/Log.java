package com.jonathan.alteration;

import java.util.ArrayList;
import java.util.Iterator;

public class Log {

    /**
     *  ArrayList containing all of the Alterations
     */
    private ArrayList<Alteration> alterationArrayList;

    /**
     * Default Constructor, initializes the alterationArrayList
     */
    public Log() {
        this.alterationArrayList = new ArrayList<>();
    }

    /**
     * Returns an alteration at the index requested
     * @param index the index of the Alteration
     * @return the alteration returned by the alterationArrayList java.util.ArrayList.get(int index) method
     */
    public Alteration getAlteration(int index) {
        return this.alterationArrayList.get(index);
    }

    /**
     * Adds an alteration to the inner alterationArrayList
     * @param alteration the alteration to be added to the list
     * @return the success flag returned by the inner alterationArrayList java.util.ArrayList.add() method
     */
    public boolean addAlteration(Alteration alteration) {
        return this.alterationArrayList.add(alteration);
    }

    /**
     * Removes an alteration from the inner alterationArrayList
     * @param alteration the alteration to be removed from the list
     * @return the success flag returned by the inner alterationArrayList java.util.ArrayList.remove(Object o) method
     */
    public boolean removeAlteration(Alteration alteration) {
        return this.alterationArrayList.remove(alteration);
    }

    /**
     * Removes an alteration from the inner alterationArrayList
     * @param index the index of the alteration to be removed from the list
     * @return the Alteration returned by the inner alterationArrayList java.util.ArrayList.remove(int index) method
     */
    public Alteration removeAlteration(int index) {
        return this.alterationArrayList.remove(index);
    }

    /**
     * Clears the inner ArrayList containing all of the alterations using java.util.ArrayList.clear() method
     */
    public void clear() {
        this.alterationArrayList.clear();
    }

    /**
     * Returns an iterator for the inner alterationArrayList
     * @return an iterator for the inner alterationArrayList
     */
    public Iterator<Alteration> alterationIterator() {
        return this.alterationArrayList.iterator();
    }

}
