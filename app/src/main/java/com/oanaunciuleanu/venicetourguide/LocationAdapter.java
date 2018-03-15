package com.oanaunciuleanu.venicetourguide;


import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColorResourceId;


    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_view);
        nameTextView.setText(currentLocation.getmName());

        // Find the TextView in the list_item.xml layout with the ID address_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_view);

        if (currentLocation.hasAddress()) {
            addressTextView.setText(currentLocation.getmAddress());
            addressTextView.setVisibility(View.VISIBLE);
            addressTextView.setTypeface(addressTextView.getTypeface(), Typeface.ITALIC);
        } else {
            addressTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID phone_view.
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_view);

        if (currentLocation.hasPhone()) {
            phoneTextView.setText(currentLocation.getmPhone());
            phoneTextView.setVisibility(View.VISIBLE);
        } else {
            phoneTextView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentLocation.getmImage());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
