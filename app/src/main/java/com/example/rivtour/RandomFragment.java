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
public class RandomFragment extends Fragment {

    public RandomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);



        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.pleasure_park,"Pleasure Park"));
        places.add(new Place(R.drawable.port_harcourt_mall,"Port Harcourt Mall"));
        places.add(new Place(R.drawable.isaac_boro_park,"Isaac Boro Park"));
        places.add(new Place(R.drawable.zoo,"Port Harcourt Zoo"));
        places.add(new Place(R.drawable.tourist_beach,"Tourist Beach"));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}