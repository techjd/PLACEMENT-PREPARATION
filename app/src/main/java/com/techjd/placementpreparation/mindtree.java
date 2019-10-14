package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mindtree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindtree);

        Button button53 = findViewById(R.id.button53);
        Button button54 = findViewById(R.id.button53);
        Button button55 = findViewById(R.id.button53);
        Button button56 = findViewById(R.id.button53);
        Button button57 = findViewById(R.id.button53);
        Button button58 = findViewById(R.id.button53);
        Button button59 = findViewById(R.id.button53);

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent min1 = new Intent(mindtree.this,mind1.class);
                startActivity(min1);
            }
        });

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent min2 = new Intent(mindtree.this,mind2.class);
                startActivity(min2);
            }
        });

        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent min3 = new Intent(mindtree.this,mind3.class);
                startActivity(min3);
            }
        });

        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent min4 = new Intent(mindtree.this,mind4.class);
                startActivity(min4);
            }
        });

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent min5 = new Intent(mindtree.this,mind5.class);
                startActivity(min5);
            }
        });

        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent min6 = new Intent(mindtree.this,mind6.class);
                startActivity(min6);
            }
        });

        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent min7 = new Intent(mindtree.this,mind7.class);
                startActivity(min7);
            }
        });
    }
}
