package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lg);

        Button button49 = findViewById(R.id.button49);
        Button button50 = findViewById(R.id.button50);
        Button button51 = findViewById(R.id.button51);

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lg1 = new Intent(lg.this,lg1.class);
                startActivity(lg1);
            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lg2 = new Intent(lg.this,lg2.class);
                startActivity(lg2);
            }
        });

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lg3 = new Intent(lg.this,lg3.class);
                startActivity(lg3);
            }
        });

    }
}
