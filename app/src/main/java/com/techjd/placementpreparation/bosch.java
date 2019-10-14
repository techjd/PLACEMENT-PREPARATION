package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bosch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosch);

        Button button47 = (Button) findViewById(R.id.button47);
        Button button48 = (Button) findViewById(R.id.button48);

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bo1 = new Intent(bosch.this,bo1.class);
                startActivity(bo1);

            }
        });

        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bo2 = new Intent(bosch.this,bo2.class);
                startActivity(bo2);
            }
        });
    }
}
