package org.hwy62arttours.arttourscatalog;

import android.content.Context;

/**
 * Created by Draz on 11/10/2015.
 */
public class CatalogManager {
    private static final String TAG = "CatMan";

    private static CatalogManager sCatalogManager;
    private Context mAppContext;

    private CatalogDBHelper mDBHelper;

    private CatalogManager(Context appContext) {
        mAppContext = appContext;
        mDBHelper = new CatalogDBHelper(mAppContext);

    }

    public static CatalogManager get(Context c) {
        if (sCatalogManager == null) {
            // Use applictaion context to avoid leaking activities
            sCatalogManager = new CatalogManager(c.getApplicationContext());
        }
        return sCatalogManager;
    }
}




