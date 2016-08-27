package org.hwy62arttours.arttourscatalog;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Draz on 11/10/2015.
 */
public class CatalogListFragment extends ListFragment {
    private String TAG = "CatalogListFragment";
    private ArrayList<Catalog> mCatalog;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.catalog_title);
        mCatalog = CatalogItems.get(getActivity()).getCatalog();

        CatalogAdapter adapter = new CatalogAdapter(mCatalog);
        setListAdapter(adapter);
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        Catalog c = ((CatalogAdapter)getListAdapter()).getItem(position);
        Log.d(TAG, c.getTitle() + " expand the entry to full page");
        //TODO create the detailed view
    }

    private class CatalogAdapter extends ArrayAdapter<Catalog> {

        public CatalogAdapter(ArrayList<Catalog> catalog) {
            super(getActivity(), 0, catalog);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            // If we weren't given a view create one
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_catalog, null);
            }


            // Configure the view for this class
            final Catalog c = getItem(position);

            TextView titleTextView =
                    (TextView)convertView.findViewById(R.id.catalog_list_item_textView);
            titleTextView.setText(c.getTitle());

            ImageView imageView = (ImageView)convertView.findViewById(R.id.catalog_list_item_imageView);
            imageView.setImageResource(c.getImage());

            CheckBox checkBox = (CheckBox)convertView.findViewById(R.id.catalog_list_item_checkBox);
            checkBox.setChecked(c.isCheckBox());

            checkBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Toggle state of checkbox");
                    // Toggle the state of checkbox and store it in the Singleton
                    if (c.isCheckBox()) {
                        c.setCheckBox(false);
                    }else{
                        c.setCheckBox(true);
                    }

                }
            });

            return convertView;

        }
    }
}


