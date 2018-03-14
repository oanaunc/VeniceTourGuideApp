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
        locations.add(new Location(R.string.pizza1name, R.string.pizza1address, R.string.pizza1phone, R.drawable.pizza1));
        locations.add(new Location(R.string.pizza2name, R.string.pizza2address, R.string.pizza2phone, R.drawable.pizza2));
        locations.add(new Location(R.string.pizza3name, R.string.pizza3address, R.string.pizza3phone, R.drawable.pizza3));
        locations.add(new Location(R.string.pizza4name, R.string.pizza4address, R.string.pizza4phone, R.drawable.pizza4));
        locations.add(new Location(R.string.pizza5name, R.string.pizza5address, R.string.pizza5phone, R.drawable.pizza5));
        locations.add(new Location(R.string.pizza6name, R.string.pizza6address, R.string.pizza6phone, R.drawable.pizza6));
        locations.add(new Location(R.string.pizza7name, R.string.pizza7address, R.string.pizza7phone, R.drawable.pizza7));
        locations.add(new Location(R.string.pizza8name, R.string.pizza8address, R.string.pizza8phone, R.drawable.pizza8));
        locations.add(new Location(R.string.pizza9name, R.string.pizza9address, R.string.pizza9phone, R.drawable.pizza9));
        locations.add(new Location(R.string.pizza10name, R.string.pizza10address, R.string.pizza10phone, R.drawable.pizza10));



        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.darkBackground);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }


}
