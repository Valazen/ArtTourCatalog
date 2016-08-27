package org.hwy62arttours.arttourscatalog;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Draz on 11/10/2015.
 *
 * This loads all the catalog information and stores it locally
 * TODO change to access a database and ideally the website API so the catalog can be updated
 * TODO make sure it is efficient for network - make a configuration parameter to turn of network update
 * TODO figure out how to save this state across app closes
 */
public class CatalogItems {
    private ArrayList<Catalog> mCatalog;
    private static CatalogItems sCatalogItems;
    private Context mAppContext;

    private CatalogItems(Context appContext){
        mAppContext = appContext;
        mCatalog = new ArrayList<Catalog>();


        for (int i= 1; i <=  6; i++) {
            Catalog c  = new Catalog();

            c.setEntryID("Entry # " + i);
            c.setTitle("Artist " + i);
            c.setCheckBox(false);
            int imageSelect = 0;
            switch (i) {
                case 1: imageSelect = R.drawable.artist_1;
                    break;
                case 2: imageSelect = R.drawable.artist_2;
                    break;
                case 3: imageSelect = R.drawable.artist_3;
                    break;
                case 4: imageSelect = R.drawable.artist_4;
                    break;
                case 5: imageSelect = R.drawable.artist_5;
                    break;
                case 6: imageSelect = R.drawable.artist_6;
                    break;
                default: imageSelect = R.drawable.empty_photo;
            }
            c.setImage(imageSelect); //TODO figure out how to load the image file in drawable
            //TODO figure out how to load all the images
            mCatalog.add(c);
        }
    }

    public static CatalogItems get(Context c){
        if (sCatalogItems == null){
            sCatalogItems = new CatalogItems(c.getApplicationContext());
        }
        return sCatalogItems;
    }

    public ArrayList<Catalog> getCatalog() {
        return mCatalog;
    }

    public Catalog getCatalog(UUID id) {
        for (Catalog c : mCatalog) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }
}
