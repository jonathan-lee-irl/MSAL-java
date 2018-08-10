package com.jonathan.alteration;

import com.jonathan.time.DateTime;

/**
 * Represents an alteration made to the system
 * Contains information such as Date and Time, Title or basic description,
 * As well as a Procedure object for storing all of the information on
 * how the alteration was performed
 */
public class Alteration {

    /**
     * Date and time at which the alteration was performed
     */
    private DateTime dateTime;

    /**
     * Title or basic description of the alteration
     */
    private String title;

    /**
     * Procedure object which contains information on how the alteration was performed
     */
    private Procedure procedure;

}
