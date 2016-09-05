package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BluesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blues);

        // Find the View that shows the artist 1.
        TextView blues = (TextView) findViewById(R.id.blues1);

        // Set a click listener on that View
        blues.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the blues artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the blues activity
                Intent blues1Intent = new Intent(BluesActivity.this, BluesArtist1.class);

                // Start the new activity
                startActivity(blues1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView blues2 = (TextView) findViewById(R.id.blues2);

        // Set a click listener on that View
        blues2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the blues artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the blues activity
                Intent blues2Intent = new Intent(BluesActivity.this, BluesArtist2.class);

                // Start the new activity
                startActivity(blues2Intent);
            }
        });
    }
}
