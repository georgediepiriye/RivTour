package com.example.rivtour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EateryFragment extends Fragment {

    public EateryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);



        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.asia_town,"Asia Town"));
        places.add(new Place(R.drawable.buns_and_batter,"Buns And Batter"));
        places.add(new Place(R.drawable.genesis,"Genesis Restaurant"));
        places.add(new Place(R.drawable.genesis_sky_bar,"Sky Bar Restaurant"));
        places.add(new Place(R.drawable.jevinik,"Jevinik Restaurant"));
        places.add(new Place(R.drawable.kilimanjaro,"Kilimanjaro"));
        places.add(new Place(R.drawable.native_tray,"Native Tray"));
        places.add(new Place(R.drawable.ororo_restaurant,"Ororo Restaurant"));
        places.add(new Place(R.drawable.red_coral,"Red Coral"));
        places.add(new Place(R.drawable.spice_route,"Spice Route"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}