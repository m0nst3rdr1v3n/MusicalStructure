package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RockArtist2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_artist2);

        Button Play = (Button) findViewById(R.id.Play);
        Play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click--from the https://developer.android.com/guide/topics/ui/controls/button.html site
                Intent rockArtist2Intent = new Intent(RockArtist2.this, NowPlaying.class);

                // Start the new activity
                startActivity(rockArtist2Intent);
            }
        });
    }
}
