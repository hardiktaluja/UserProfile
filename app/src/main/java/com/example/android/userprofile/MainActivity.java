package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profilePicture = (ImageView) findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.profile_picture);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Hardik");

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("08/01/1997");

        TextView country = (TextView) findViewById(R.id.school);
        country.setText("Maharaja Agrasen Institute of Technology");
    }
}
