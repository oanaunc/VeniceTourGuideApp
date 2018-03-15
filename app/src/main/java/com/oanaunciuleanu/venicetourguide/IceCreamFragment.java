package com.oanaunciuleanu.venicetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        locations.add(new Location(getResources().getString(R.string.icecream1name), getResources().getString(R.string.icecream1address), getResources().getString(R.string.icecream1phone), R.drawable.icecream1));
        locations.add(new Location(getResources().getString(R.string.icecream2name), getResources().getString(R.string.icecream2address), getResources().getString(R.string.icecream2phone), R.drawable.icecream2));
        locations.add(new Location(getResources().getString(R.string.icecream3name), getResources().getString(R.string.icecream3address), getResources().getString(R.string.icecream3phone), R.drawable.icecream3));
        locations.add(new Location(getResources().getString(R.string.icecream4name), getResources().getString(R.string.icecream4address), getResources().getString(R.string.icecream4phone), R.drawable.icecream4));
        locations.add(new Location(getResources().getString(R.string.icecream5name), getResources().getString(R.string.icecream5address), getResources().getString(R.string.icecream5phone), R.drawable.icecream5));
        locations.add(new Location(getResources().getString(R.string.icecream6name), getResources().getString(R.string.icecream6address), getResources().getString(R.string.icecream6phone), R.drawable.icecream6));
        locations.add(new Location(getResources().getString(R.string.icecream7name), getResources().getString(R.string.icecream7address), getResources().getString(R.string.icecream7phone), R.drawable.icecream7));
        locations.add(new Location(getResources().getString(R.string.icecream8name), getResources().getString(R.string.icecream8address), getResources().getString(R.string.icecream8phone), R.drawable.icecream8));
        locations.add(new Location(getResources().getString(R.string.icecream9name), getResources().getString(R.string.icecream9address), getResources().getString(R.string.icecream9phone), R.drawable.icecream9));
        locations.add(new Location(getResources().getString(R.string.icecream10name), getResources().getString(R.string.icecream10address), getResources().getString(R.string.icecream10phone), R.drawable.icecream10));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.darkBackground);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}
