package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        // Find the View that shows the sign_in button
        Button sign_in = (Button) findViewById(R.id.sign_in);

        // Set a click listener on that View
        if (sign_in != null) {
            sign_in.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent sign_inIntent = new Intent(MainActivity.this, LauncherActivity.class);
                    startActivity(sign_inIntent);
                }
            });
        }
        // Find the View that shows the Create an account button
        Button create_account = (Button) findViewById(R.id.create_account);

        // Set a click listener on that View
        if (create_account != null) {
            create_account.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent create_accountIntent = new Intent(MainActivity.this, SignUpActivity.class);
                    startActivity(create_accountIntent);
                }
            });
        }
    }
}
