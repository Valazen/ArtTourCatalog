package org.hwy62arttours.arttourscatalog;

import android.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;

public class CatalogActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CatalogFragment();

    //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    // fab.setOnClickListener(new View.OnClickListener()

    //{
     //   @Override
    //    public void onClick (View view){
     //   Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
    //            .setAction("Action", null).show();
    //}
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
