package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        // Find the View that shows the artist 1.
        TextView country = (TextView) findViewById(R.id.country1);

        // Set a click listener on that View
        country.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the country artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the country activity
                Intent country1Intent = new Intent(CountryActivity.this, CountryArtist1.class);

                // Start the new activity
                startActivity(country1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView country2 = (TextView) findViewById(R.id.country2);

        // Set a click listener on that View
        country2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the country artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the country activity
                Intent country2Intent = new Intent(CountryActivity.this, CountryArtist2.class);

                // Start the new activity
                startActivity(country2Intent);
            }
        });
    }
}
