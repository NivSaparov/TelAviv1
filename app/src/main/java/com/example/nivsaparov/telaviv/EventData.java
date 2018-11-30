package com.example.nivsaparov.telaviv;

public class EventData {

    private int mImageResourceId;
    private String mTitle;
    private String mDescription;

    public EventData(int imageResourceId, String title, String description){
        mImageResourceId = imageResourceId;
        mTitle= title;
        mDescription = description;
    }

    public String getTitle() {
        return mTitle;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getDescription() {
        return mDescription;
    }
}
