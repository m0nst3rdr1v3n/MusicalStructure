package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PunkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punk);

        // Find the View that shows the artist 1.
        TextView punk1 = (TextView) findViewById(R.id.punk1);

        // Set a click listener on that View
        punk1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the punk artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the punk activity
                Intent punk1Intent = new Intent(PunkActivity.this, PunkArtist1.class);

                // Start the new activity
                startActivity(punk1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView punk2 = (TextView) findViewById(R.id.punk2);

        // Set a click listener on that View
        punk2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the punk artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the punk activity
                Intent punk2Intent = new Intent(PunkActivity.this, PunkArtist2.class);

                // Start the new activity
                startActivity(punk2Intent);
            }
        });
    }
}
