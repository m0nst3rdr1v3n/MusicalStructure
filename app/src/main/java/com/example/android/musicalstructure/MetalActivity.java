package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MetalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal);
        // Find the View that shows the artist 1.
        TextView metal = (TextView) findViewById(R.id.metal1);

        // Set a click listener on that View
        metal.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the metal artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the metal activity
                Intent metal1Intent = new Intent(MetalActivity.this, MetalArtist1.class);

                // Start the new activity
                startActivity(metal1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView metal2 = (TextView) findViewById(R.id.metal2);

        // Set a click listener on that View
        metal2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the metal artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the metal activity
                Intent metal2Intent = new Intent(MetalActivity.this, MetalArtist2.class);

                // Start the new activity
                startActivity(metal2Intent);
            }
        });

    }
}
