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
public class HospitalFragment extends Fragment {

    public HospitalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);



        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.first_rivers_hospital,"First Rivers Hospital"));
        places.add(new Place(R.drawable.gynescope_specialist_hospital,"Gynescope Specialist Hospital"));
        places.add(new Place(R.drawable.kelsey_harrison_hospital,"Kelsey Harrison Hospital"));
        places.add(new Place(R.drawable.la_meridien_hospital,"La Meridien Hospital"));
        places.add(new Place(R.drawable.morning_star_hospital,"Morning Star Hospital"));
        places.add(new Place(R.drawable.new_mile_one_hospital,"New Mile 1 Hospital"));
        places.add(new Place(R.drawable.pamo_hospital,"Pamo Hospital"));
        places.add(new Place(R.drawable.st_martins_hospital,"St Martins Hospital"));
        places.add(new Place(R.drawable.sterling_hospital,"Sterling Hospital"));
        places.add(new Place(R.drawable.the_bridge_clinic,"The Bridge Clinic"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}