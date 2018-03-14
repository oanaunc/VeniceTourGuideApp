package com.oanaunciuleanu.venicetourguide;

public class Location {

    /** String resource ID for the name */
    private int mName;

    /** String resource ID for the address */
    private int mAddress;

    /** String resource ID for the phone number */
    private int mPhone;

    /** Image resource ID for the word */
    private int mImage;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    // Create a new Location object for the Monuments page

    public Location(int mName, int mAddress, int mImage) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mImage = mImage;
    }

    // Create a new Location object for the Bridge page

    public Location(int mName, int mImage) {
        this.mName = mName;
        this.mImage = mImage;
    }

    // Create a new Location object for the Pizza and Ice Cream page

    public Location(int mName, int mAddress, int mPhone, int mImage) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mImage = mImage;
    }

    /**
     * Get the string resource ID for the name.
     */

    public int getmName() {
        return mName;
    }

    /**
     * Get the string resource ID for the address.
     */

    public int getmAddress() {
        return mAddress;
    }

    /**
     * Get the string resource ID for the phone number.
     */

    public int getmPhone() {
        return mPhone;
    }

    /**
     * Get the string resource ID for the image.
     */

    public int getmImage() {
        return mImage;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
