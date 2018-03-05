package com.example.android.miwok;

import android.graphics.Bitmap;

/**
 * Created by Anzen Digital on 21/02/2018.
 */

public class Word {

    private static final int NO_IMAGE = -1;
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourcesID = NO_IMAGE;


    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourcesID(){ return imageResourcesID; }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourcesID){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourcesID = imageResourcesID;
    }

    public Word(String miwokTranslation, String defaultTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public boolean hasImage() {
        return  imageResourcesID != NO_IMAGE;
    }
}
