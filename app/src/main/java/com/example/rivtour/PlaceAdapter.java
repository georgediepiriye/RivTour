package com.example.rivtour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {



    public PlaceAdapter(Activity context, ArrayList<Place> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_list, parent, false);
        }
//gets the place object at the different positions on the list
        Place currentPlace = getItem(position);

        //finds the image view with the given ID
        ImageView image = listItemView.findViewById(R.id.image_text_view);
        //sets the gotten image on the image text view
        image.setImageResource(currentPlace.getImageResourceId());

        TextView textView = listItemView.findViewById(R.id.name_text_view);
        textView.setText(currentPlace.getName());

        return listItemView;
    }
}
