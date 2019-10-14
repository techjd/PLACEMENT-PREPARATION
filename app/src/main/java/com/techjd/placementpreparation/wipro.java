package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wipro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wipro);

        //66 TO 73

        Button button66 = findViewById(R.id.button66);
        Button button67 = findViewById(R.id.button67);
        Button button68 = findViewById(R.id.button68);
        Button button69 = findViewById(R.id.button69);
        Button button70 = findViewById(R.id.button70);
        Button button71 = findViewById(R.id.button71);
        Button button72 = findViewById(R.id.button72);
        Button button73 = findViewById(R.id.button73);

        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wip66 = new Intent(wipro.this,wip1.class);
                startActivity(wip66);
            }
        });

        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wip67 = new Intent(wipro.this,wip2.class);
                startActivity(wip67);
            }
        });

        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wip68 = new Intent(wipro.this,wip3.class);
                startActivity(wip68);
            }
        });

        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wip69 = new Intent(wipro.this,wip4.class);
                startActivity(wip69);
            }
        });

        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wip70 = new Intent(wipro.this,wip5.class);
                startActivity(wip70);
            }
        });

        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wip71 = new Intent(wipro.this,wip6.class);
                startActivity(wip71);
            }
        });

        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wip72 = new Intent(wipro.this,wip7.class);
                startActivity(wip72);
            }
        });
        
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wip73 = new Intent(wipro.this,wip8.class);
                startActivity(wip73);
            }
        });


    }
}
