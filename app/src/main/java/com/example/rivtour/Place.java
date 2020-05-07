package com.example.rivtour;

public class Place {

    /**
     * variable for image Id's
     */
    private int mImageResourceId;

    /**
     * variable for name of place
     */
    private String mName;

    /**
     * constructor for places object
     */
    public Place(int imageResourceId, String name) {
         mImageResourceId = imageResourceId;
         mName = name;
    }

    /**
     * gets the name of the image resource Id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * gets the name of the place
     */
    public String getName() {
        return mName;
    }
}
