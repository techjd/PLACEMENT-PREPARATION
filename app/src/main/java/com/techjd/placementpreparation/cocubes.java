package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cocubes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocubes);

        Button button39 = (Button) findViewById(R.id.button39);
        Button button40 = (Button) findViewById(R.id.button40);

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cc1 = new Intent(cocubes.this,cc1.class);
                startActivity(cc1);
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cc2 = new Intent(cocubes.this,cc2.class);
                startActivity(cc2);
            }
        });
    }
}
