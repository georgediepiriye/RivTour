package com.example.rivtour;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


//Array list of Places
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.presidential,"Hotel Presidential"));
        places.add(new Place(R.drawable.golden_tulip_hotel,"Golder Tulip Hotel"));
        places.add(new Place(R.drawable.swiss_hotel,"Swiss Hotel"));
        places.add(new Place(R.drawable.best_western_hotel,"Best Western Hotel"));
        places.add(new Place(R.drawable.hatfield_hotel,"Hartfield Hotel"));
        places.add(new Place(R.drawable.juanita_hotel,"Juanita Hotel"));
        places.add(new Place(R.drawable.la_meridien_hotel,"La Meridien Hotel"));
        places.add(new Place(R.drawable.novotel_hotel,"Novotel Hotel"));
        places.add(new Place(R.drawable.olive_branch_hotel,"Olive Branch Hotel"));
        places.add(new Place(R.drawable.somitel_hotel,"Somitel Hotel"));

        //Array adapter to populate array list
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);



       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Place placeData = (Place)listView.getItemAtPosition(position);
               String title = placeData.getName();
               int image = placeData.getImageResourceId();

               Intent intent = new Intent(getActivity(),HotelDetailsActivity.class);
               intent.putExtra("title", title);
               intent.putExtra("image",image);
               startActivity(intent);

           }
       });


        return rootView;
    }


}