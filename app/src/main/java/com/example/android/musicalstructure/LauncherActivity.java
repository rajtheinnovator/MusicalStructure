package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LauncherActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create your view and set their onClickListener to "this"
        ImageView weekly_top_15 = (ImageView) findViewById(R.id.weekly_top_15);
        weekly_top_15.setOnClickListener(this);

        //Create your view and set their onClickListener to "this"
        ImageView artist1 = (ImageView) findViewById(R.id.artist1);
        artist1.setOnClickListener(this);

        //Create your view and set their onClickListener to "this"
        ImageView recent_movies = (ImageView) findViewById(R.id.recent_movies);
        recent_movies.setOnClickListener(this);

        //Create your view and set their onClickListener to "this"
        ImageView party = (ImageView) findViewById(R.id.party);
        party.setOnClickListener(this);

        //Create your view and set their onClickListener to "this"
        ImageView ghazal = (ImageView) findViewById(R.id.ghazal);
        ghazal.setOnClickListener(this);

        //Create your view and set their onClickListener to "this"
        ImageView romance = (ImageView) findViewById(R.id.romance);
        romance.setOnClickListener(this);

        //Create your view and set their onClickListener to "this"
        ImageView chill = (ImageView) findViewById(R.id.chill);
        chill.setOnClickListener(this);
        Button view_playList = (Button) findViewById(R.id.view_playlist);
        view_playList.setOnClickListener(this);
        //Sign Out button Logic
        Button sign_out = (Button) findViewById(R.id.sign_out);
        // Set a click listener on sign_out
        if (sign_out != null) {
            sign_out.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent sign_outIntent = new Intent(LauncherActivity.this, MainActivity.class);
                    startActivity(sign_outIntent);
                }
            });
        }
        //Previous song/Play Song/Next Song Button Logic
        ImageView play = (ImageView) findViewById(R.id.play);
        ImageView skip_previous = (ImageView) findViewById(R.id.skip_previous);
        ImageView skip_next = (ImageView) findViewById(R.id.skip_next);
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(LauncherActivity.this, "Plays Song", Toast.LENGTH_SHORT).show();
            }
        });
        skip_next.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(LauncherActivity.this, "Skips to Next Song", Toast.LENGTH_SHORT).show();
            }
        });
        skip_previous.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(LauncherActivity.this, "Skips Back to previous song", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //implement the onClick method here
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        // Perform action on click
        switch (v.getId()) {
            case R.id.weekly_top_15:
                //Corresponding Activity
                Intent correspondingIntent1 = new Intent(LauncherActivity.this, SelectedListActivity.class);
                startActivity(correspondingIntent1);

                break;
            case R.id.artist1:
                //Corresponding Activity
                Intent correspondingIntent2 = new Intent(LauncherActivity.this, SelectedListActivity.class);
                startActivity(correspondingIntent2);

                break;
            case R.id.recent_movies:
                //Corresponding Activity
                Intent correspondingIntent3 = new Intent(LauncherActivity.this, SelectedListActivity.class);
                startActivity(correspondingIntent3);

                break;
            case R.id.party:
                //Corresponding Activity
                Intent correspondingIntent4 = new Intent(LauncherActivity.this, SelectedListActivity.class);
                startActivity(correspondingIntent4);
                break;
            case R.id.ghazal:
                //Corresponding Activity
                Intent correspondingIntent5 = new Intent(LauncherActivity.this, SelectedListActivity.class);
                startActivity(correspondingIntent5);

                break;
            case R.id.romance:
                //Corresponding Activity
                Intent correspondingIntent6 = new Intent(LauncherActivity.this, SelectedListActivity.class);
                startActivity(correspondingIntent6);

                break;
            case R.id.chill:
                //Corresponding Activity
                Intent correspondingIntent7 = new Intent(LauncherActivity.this, SelectedListActivity.class);
                startActivity(correspondingIntent7);

                break;
            case R.id.view_playlist:
                //Corresponding Activity
                Intent correspondingIntent8 = new Intent(LauncherActivity.this, ViewPlaylistActivity.class);
                startActivity(correspondingIntent8);

        }


    }
}
