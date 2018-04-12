package com.example.davidduarte.xfootball;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by davidduarte on 05/04/2018.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(mContext);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.item, null);

            // set image based on selected text
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);

            TextView textView = (TextView) gridView
                    .findViewById(R.id.grid_item_text);

            imageView.setImageResource(mThumbIds[position]);

            textView.setText("Testeeeee");


        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united,
            R.drawable.team_man_united, R.drawable.team_man_united
    };
}
