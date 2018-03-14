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



public class IceCreamFragment extends Fragment {


    public IceCreamFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.icecream1name, R.string.icecream1address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream2name, R.string.icecream2address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream3name, R.string.icecream3address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream4name, R.string.icecream4address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream5name, R.string.icecream5address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream6name, R.string.icecream6address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream7name, R.string.icecream7address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream8name, R.string.icecream8address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream9name, R.string.icecream1address, R.string.icecream1phone, R.drawable.icecream1));
        locations.add(new Location(R.string.icecream10name, R.string.icecream1address, R.string.icecream1phone, R.drawable.icecream1));



        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.darkBackground);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }


}
