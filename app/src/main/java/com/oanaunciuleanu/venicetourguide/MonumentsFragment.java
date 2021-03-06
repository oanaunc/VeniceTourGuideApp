package com.oanaunciuleanu.venicetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of monuments.
 */
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.monument1name), getResources().getString(R.string.monument1address), R.drawable.monument1));
        locations.add(new Location(getResources().getString(R.string.monument2name), getResources().getString(R.string.monument2address), R.drawable.monument2));
        locations.add(new Location(getResources().getString(R.string.monument3name), getResources().getString(R.string.monument3address), R.drawable.monument3));
        locations.add(new Location(getResources().getString(R.string.monument4name), getResources().getString(R.string.monument4address), R.drawable.monument4));
        locations.add(new Location(getResources().getString(R.string.monument5name), getResources().getString(R.string.monument5address), R.drawable.monument5));
        locations.add(new Location(getResources().getString(R.string.monument6name), getResources().getString(R.string.monument6address), R.drawable.monument6));
        locations.add(new Location(getResources().getString(R.string.monument7name), getResources().getString(R.string.monument7address), R.drawable.monument7));
        locations.add(new Location(getResources().getString(R.string.monument8name), getResources().getString(R.string.monument8address), R.drawable.monument8));
        locations.add(new Location(getResources().getString(R.string.monument9name), getResources().getString(R.string.monument9address), R.drawable.monument9));
        locations.add(new Location(getResources().getString(R.string.monument10name), getResources().getString(R.string.monument10address), R.drawable.monument10));
        locations.add(new Location(getResources().getString(R.string.monument11name), getResources().getString(R.string.monument11address), R.drawable.monument11));
        locations.add(new Location(getResources().getString(R.string.monument12name), getResources().getString(R.string.monument12address), R.drawable.monument12));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.darkBackground);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}
