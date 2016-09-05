package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        // Find the View that shows the jazz genre
        TextView jazz = (TextView) findViewById(R.id.jazz_genre);

        // Set a click listener on that View
        jazz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the jazz genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the jazz activity
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);

                // Start the new activity
                startActivity(jazzIntent);
            }
        });

        // Find the View that shows the metal genre
        TextView metal = (TextView) findViewById(R.id.metal_genre);

        // Set a click listener on that View
        metal.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the metal genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the metal activity
                Intent metalIntent = new Intent(MainActivity.this, MetalActivity.class);

                // Start the new activity
                startActivity(metalIntent);
            }
        });


        // Find the View that shows the pop genre
        TextView pop = (TextView) findViewById(R.id.pop_genre);

        // Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the pop activity
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });

        // Find the View that shows the punk genre
        TextView punk = (TextView) findViewById(R.id.punk_genre);

        // Set a click listener on that View
        punk.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the punk genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the punk activity
                Intent punkIntent = new Intent(MainActivity.this, PunkActivity.class);

                // Start the new activity
                startActivity(punkIntent);
            }
        });

        // Find the View that shows the rock genre
        TextView rock = (TextView) findViewById(R.id.rock_genre);

        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the rock genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the rock activity
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the soundtracks genre
        TextView soundtracks = (TextView) findViewById(R.id.soundtracks_genre);

        // Set a click listener on that View
        soundtracks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the soundtracks genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the soundtracks activity
                Intent soundtracksIntent = new Intent(MainActivity.this, SoundtracksActivity.class);

                // Start the new activity
                startActivity(soundtracksIntent);
            }
        });
        //To do...finish adding all the genre intents here. Also look into fixing the search bar as the text keyboard automatically pops up when you opn the app. I want it to be clickable.
    }
}
