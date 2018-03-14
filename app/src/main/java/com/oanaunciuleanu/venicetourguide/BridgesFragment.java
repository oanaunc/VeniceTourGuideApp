package com.oanaunciuleanu.venicetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.oanaunciuleanu.venicetourguide.LocationAdapter;
import com.oanaunciuleanu.venicetourguide.R;

import java.util.ArrayList;


public class BridgesFragment extends Fragment {
    public BridgesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.bridge1name, R.drawable.bridge1));
        locations.add(new Location(R.string.bridge2name, R.drawable.bridge2));
        locations.add(new Location(R.string.bridge3name, R.drawable.bridge3));
        locations.add(new Location(R.string.bridge4name, R.drawable.bridge4));
        locations.add(new Location(R.string.bridge5name, R.drawable.bridge5));
        locations.add(new Location(R.string.bridge6name, R.drawable.bridge6));
        locations.add(new Location(R.string.bridge7name, R.drawable.bridge7));
        locations.add(new Location(R.string.bridge8name, R.drawable.bridge8));
        locations.add(new Location(R.string.bridge9name, R.drawable.bridge9));
        locations.add(new Location(R.string.bridge10name, R.drawable.bridge10));
        locations.add(new Location(R.string.bridge11name, R.drawable.bridge11));
        locations.add(new Location(R.string.bridge12name, R.drawable.bridge12));
        locations.add(new Location(R.string.bridge13name, R.drawable.bridge13));
        locations.add(new Location(R.string.bridge14name, R.drawable.bridge14));
        locations.add(new Location(R.string.bridge15name, R.drawable.bridge15));
        locations.add(new Location(R.string.bridge16name, R.drawable.bridge16));



        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.darkBackground);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }


}
