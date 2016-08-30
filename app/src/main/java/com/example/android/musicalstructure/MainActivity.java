package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the alternative genre
        TextView alternative = (TextView) findViewById(R.id.genre_alternative);

        // Set a click listener on that View
        alternative.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alternative genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the alternative activity
                Intent alternativeIntent = new Intent(MainActivity.this, AlternativeActivity.class);

                // Start the new activity
                startActivity(alternativeIntent);
            }
        });

        // Find the View that shows the blues genre
        TextView blues = (TextView) findViewById(R.id.genre_blues);

        // Set a click listener on that View
        blues.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the blues genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the blues activity
                Intent bluesIntent = new Intent(MainActivity.this, BluesActivity.class);

                // Start the new activity
                startActivity(bluesIntent);
            }
        });

        // Find the View that shows the country genre
        TextView country = (TextView) findViewById(R.id.country_genre);

        // Set a click listener on that View
        country.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the country genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the country activity
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(countryIntent);
            }
        });

        // Find the View that shows the hip hop genre
        TextView hiphop = (TextView) findViewById(R.id.hiphop_genre);

        // Set a click listener on that View
        hiphop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hip hop genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the hip hop activity
                Intent hiphopIntent = new Intent(MainActivity.this, HipHopActivity.class);

                // Start the new activity
                startActivity(hiphopIntent);
            }
        });

        //To do...finish adding all the genre intents here. Also look into fixing the search bar as the text keyboard automatically pops up when you opn the app. I want it to be clickable. 
    }
}
