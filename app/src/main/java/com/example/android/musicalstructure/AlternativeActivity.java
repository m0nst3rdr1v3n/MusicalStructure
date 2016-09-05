package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlternativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative);

        // Find the View that shows the artist 1.
        TextView alternative = (TextView) findViewById(R.id.alternative1);

        // Set a click listener on that View
        alternative.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alternative artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the alternative activity
                Intent alternative1Intent = new Intent(AlternativeActivity.this, AlternativeArtist1.class);

                // Start the new activity
                startActivity(alternative1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView alternative2 = (TextView) findViewById(R.id.alternative2);

        // Set a click listener on that View
        alternative2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alternative artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the alternative activity
                Intent alternative2Intent = new Intent(AlternativeActivity.this, AlternativeArtist2.class);

                // Start the new activity
                startActivity(alternative2Intent);
            }
        });
    }
}
