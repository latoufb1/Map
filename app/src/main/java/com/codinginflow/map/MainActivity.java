package com.codinginflow.map;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonDrive = findViewById(R.id.drive);
        buttonDrive.setOnClickListener(new View.OnClickListener() {
            //On click brings up Google Maps
            public void onClick(View v) {
                Intent activity = new Intent(MainActivity.this, MapActivity.class);
                startActivity(activity);
            }
        });
    }
}
