package org.hwy62arttours.arttourscatalog;

import android.app.Fragment;

/**
 * Created by Draz on 11/10/2015.
 *
 * TODO add in the network checking code from the DisplayImages Solution example
 * TODO find a good general error handler for uncaught exceptions
 */
public class CatalogListActivity extends SingleFragmentActivity {
    private String TAG = "Catalog Activity";
    @Override
    protected Fragment createFragment() {
        return new CatalogListFragment();
    }

}
