package com.example.rivtour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HotelDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_details);


        TextView textView = findViewById(R.id.hotel_details_name);
        ImageView imageView = findViewById(R.id.hotel_details_image);

        //creates and gets intent from hotel fragment
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        //gets the title from intent
        String title = bundle.getString("title");
        //gets the image from intent
        int image = bundle.getInt("image");

//sets the gotten title on the given text view object
        textView.setText(title);
        //sets the gotten image on the given image view object
        imageView.setImageResource(image);

        Button button = findViewById(R.id.booking_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.booking.com/city/ng/port-harcourt.en.html?aid=303948;label=port-harcourt-6rbbv34dtdkPngbve7aUFgS382875521740:pl:ta:p15:p2:ac:ap:neg:fi:tiaud-85317449633:kwd-549617221:lp1010297:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9Yf5EcukO1MOGLSSAuId8ToA;ws=&gclid=Cj0KCQjwncT1BRDhARIsAOQF9LnnE2QBsixYbWeXHSD7pWOHQMZPJbvOETLn3_FExBDmFXZbx0IydZ8aAtXWEALw_wcB");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });

    }


}
