package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SoundtracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundtracks);

        // Find the View that shows the artist 1.
        TextView soundtracks1 = (TextView) findViewById(R.id.soundtrack1);

        // Set a click listener on that View
        soundtracks1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the soundtracks artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the soundtracks activity
                Intent soundtracks1Intent = new Intent(SoundtracksActivity.this, SoundtrackArtist1.class);

                // Start the new activity
                startActivity(soundtracks1Intent);
            }
        });

        // Find the View that shows the artist 2.
        final TextView soundtracks2 = (TextView) findViewById(R.id.soundtrack2);

        // Set a click listener on that View
        soundtracks2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the soundtracks artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the soundtracks activity
                Intent soundtracks2Intent = new Intent(SoundtracksActivity.this, SoundtrackArtist2.class);

                // Start the new activity
                startActivity(soundtracks2Intent);
            }
        });
    }
}
