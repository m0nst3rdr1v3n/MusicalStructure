package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        // Find the View that shows the artist 1.
        TextView pop1 = (TextView) findViewById(R.id.pop1);

        // Set a click listener on that View
        pop1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop artist 1 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the pop activity
                Intent pop1Intent = new Intent(PopActivity.this, PopArtist1.class);


                // Start the new activity
                startActivity(pop1Intent);
            }
        });

        // Find the View that shows the artist 2.
        TextView pop2 = (TextView) findViewById(R.id.pop2);


        // Set a click listener on that View
        pop2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop artist 2 is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the pop activity
                Intent pop2Intent = new Intent(PopActivity.this, PopArtist2.class);

                // Start the new activity
                startActivity(pop2Intent);
            }
        });
    }
}
