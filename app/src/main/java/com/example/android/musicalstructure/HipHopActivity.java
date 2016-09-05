package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_hop);

        // Find the View that shows the artist 1.
        TextView hiphop = (TextView) findViewById(R.id.hiphop1);

        // Set a click listener on that View
        hiphop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hip hop artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the hip hop activity
                Intent hiphop1Intent = new Intent(HipHopActivity.this, HipHopArtist1.class);

                // Start the new activity
                startActivity(hiphop1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView hiphop2 = (TextView) findViewById(R.id.hiphop2);

        // Set a click listener on that View
        hiphop2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hip hop artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the hip hop activity
                Intent hiphop2Intent = new Intent(HipHopActivity.this, HipHopArtist2.class);

                // Start the new activity
                startActivity(hiphop2Intent);
            }
        });
    }
}
