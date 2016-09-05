package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        // Find the View that shows the artist 1.
        TextView rock1 = (TextView) findViewById(R.id.rock1);

        // Set a click listener on that View
        rock1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the rock artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the rock activity
                Intent rock1Intent = new Intent(RockActivity.this, RockArtist1.class);

                // Start the new activity
                startActivity(rock1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView rock2 = (TextView) findViewById(R.id.rock2);

        // Set a click listener on that View
        rock2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the rock artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the rock activity
                Intent rock2Intent = new Intent(RockActivity.this, RockArtist2.class);

                // Start the new activity
                startActivity(rock2Intent);
            }
        });
    }
}
