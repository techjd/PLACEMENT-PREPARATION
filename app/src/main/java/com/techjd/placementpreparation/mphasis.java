package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mphasis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mphasis);

        Button button43 = findViewById(R.id.button43);
        Button button44 = findViewById(R.id.button44);
        Button button45 = findViewById(R.id.button45);
        Button button46 = findViewById(R.id.button46);

        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mp1 = new Intent(mphasis.this,mph1.class);
                startActivity(mp1);
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mp2 = new Intent(mphasis.this,mph2.class);
                startActivity(mp2);
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mp3 = new Intent(mphasis.this,mph3.class);
                startActivity(mp3);
            }
        });

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mp4 = new Intent(mphasis.this,mph4.class);
                startActivity(mp4);
            }
        });
    }
}
