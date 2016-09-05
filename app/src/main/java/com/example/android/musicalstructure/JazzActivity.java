package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        // Find the View that shows the artist 1.
        TextView jazz = (TextView) findViewById(R.id.jazz1);

        // Set a click listener on that View
        jazz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the jazz artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the jazz activity
                Intent jazz1Intent = new Intent(JazzActivity.this, JazzArtist1.class);

                // Start the new activity
                startActivity(jazz1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView jazz2 = (TextView) findViewById(R.id.jazz2);

        // Set a click listener on that View
        jazz2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the jazz artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the jazz activity
                Intent jazz2Intent = new Intent(JazzActivity.this, JazzArtist2.class);

                // Start the new activity
                startActivity(jazz2Intent);
            }
        });
    }
}
