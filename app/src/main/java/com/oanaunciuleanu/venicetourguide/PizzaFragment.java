package com.oanaunciuleanu.venicetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PizzaFragment extends Fragment {
    public PizzaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.pizza1name), getResources().getString(R.string.pizza1address), getResources().getString(R.string.pizza1phone), R.drawable.pizza1));
        locations.add(new Location(getResources().getString(R.string.pizza2name), getResources().getString(R.string.pizza2address), getResources().getString(R.string.pizza2phone), R.drawable.pizza2));
        locations.add(new Location(getResources().getString(R.string.pizza3name), getResources().getString(R.string.pizza3address), getResources().getString(R.string.pizza3phone), R.drawable.pizza3));
        locations.add(new Location(getResources().getString(R.string.pizza4name), getResources().getString(R.string.pizza4address), getResources().getString(R.string.pizza4phone), R.drawable.pizza4));
        locations.add(new Location(getResources().getString(R.string.pizza5name), getResources().getString(R.string.pizza5address), getResources().getString(R.string.pizza5phone), R.drawable.pizza5));
        locations.add(new Location(getResources().getString(R.string.pizza6name), getResources().getString(R.string.pizza6address), getResources().getString(R.string.pizza6phone), R.drawable.pizza6));
        locations.add(new Location(getResources().getString(R.string.pizza7name), getResources().getString(R.string.pizza7address), getResources().getString(R.string.pizza7phone), R.drawable.pizza7));
        locations.add(new Location(getResources().getString(R.string.pizza8name), getResources().getString(R.string.pizza8address), getResources().getString(R.string.pizza8phone), R.drawable.pizza8));
        locations.add(new Location(getResources().getString(R.string.pizza9name), getResources().getString(R.string.pizza9address), getResources().getString(R.string.pizza9phone), R.drawable.pizza9));
        locations.add(new Location(getResources().getString(R.string.pizza10name), getResources().getString(R.string.pizza10address), getResources().getString(R.string.pizza10phone), R.drawable.pizza10));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.darkBackground);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}
