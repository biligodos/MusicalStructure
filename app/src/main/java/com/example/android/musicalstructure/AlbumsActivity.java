package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nikolaos on 23/5/2017.
 */
public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        TextView mainScreen = (TextView) findViewById(R.id.home);
// Set a click listener on that View
        mainScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainscreenIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(mainscreenIntent);
            }
        });

    }
}