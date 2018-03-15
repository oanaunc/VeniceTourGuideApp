package com.oanaunciuleanu.venicetourguide;

public class Location {

    /**
     * String resource ID for the name
     */
    private String mName;

    /**
     * String resource ID for the address
     */
    private String mAddress;

    /**
     * String resource ID for the phone number
     */
    private String mPhone;

    /**
     * Image resource ID for the word
     */
    private int mImage;


    /**
     * Constant value that represents no image was provided for this word
     */
    private static final String NO_VALUE_PROVIDED = null;


    // Create a new Location object for the Monuments page

    public Location(String mName, String mAddress, int mImage) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mImage = mImage;
    }

    // Create a new Location object for the Bridge page

    public Location(String mName, int mImage) {
        this.mName = mName;
        this.mImage = mImage;
    }

    // Create a new Location object for the Pizza and Ice Cream page

    public Location(String mName, String mAddress, String mPhone, int mImage) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mImage = mImage;
    }

    /**
     * Get the string resource ID for the name.
     */

    public String getmName() {
        return mName;
    }

    /**
     * Get the string resource ID for the address.
     */

    public String getmAddress() {
        return mAddress;
    }

    /**
     * Get the string resource ID for the phone number.
     */

    public String getmPhone() {
        return mPhone;
    }

    /**
     * Get the string resource ID for the image.
     */

    public int getmImage() {
        return mImage;
    }

    public boolean hasAddress() {
        return mAddress != NO_VALUE_PROVIDED;
    }

    public boolean hasPhone() {
        return mPhone != NO_VALUE_PROVIDED;
    }

}
