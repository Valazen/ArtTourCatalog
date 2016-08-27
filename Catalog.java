package org.hwy62arttours.arttourscatalog;

import java.util.UUID;

/**
 * Created by Draz on 11/10/2015.
 */
public class Catalog {
    private UUID mId;
    private String mEntryID; /// entry in the table
    private String mTitle; // Artist name
    private int mImageRId; //thumbnail image for listing resource ID
    private boolean mCheckBox; // checkbox to add to the tour list
    //TODO expand the entry for the catalog to contain all the artist information

    public boolean isCheckBox() {
        return mCheckBox;
    }

    public void setCheckBox(boolean mCheckBox) {
        this.mCheckBox = mCheckBox;
    }



    public String getEntryID() {
        return mEntryID;
    }

    public void setEntryID(String mEntryID) {
        this.mEntryID = mEntryID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getImage() {
        return mImageRId;
    }

    public void setImage(int mImage) {
        this.mImageRId = mImage;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public Catalog() {
        mId = UUID.randomUUID();
        mTitle = "We made it.";
    }

    @Override
    public String toString(){
        return mTitle;
    }

}
