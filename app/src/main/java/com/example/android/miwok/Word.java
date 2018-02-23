package com.example.android.miwok;

/**
 * Created by Anzen Digital on 21/02/2018.
 */

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }
}
