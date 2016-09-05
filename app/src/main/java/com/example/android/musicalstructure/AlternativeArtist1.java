package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlternativeArtist1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_artist1);

        Button Play = (Button) findViewById(R.id.Play);
        Play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click--from the https://developer.android.com/guide/topics/ui/controls/button.html site
                Intent alternativeArtist1Intent = new Intent(AlternativeArtist1.this, NowPlaying.class);

                // Start the new activity
                startActivity(alternativeArtist1Intent);
            }
        });

    }
}
