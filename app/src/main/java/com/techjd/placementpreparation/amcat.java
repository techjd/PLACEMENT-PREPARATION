package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class amcat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amcat);

        Button button26 = (Button) findViewById(R.id.button26);
        Button button27 = (Button) findViewById(R.id.button27);
        Button button28 = (Button) findViewById(R.id.button28);
        Button button29 = (Button) findViewById(R.id.button29);
        Button button30 = (Button) findViewById(R.id.button30);
        Button button31 = (Button) findViewById(R.id.button31);
        Button button32 = (Button) findViewById(R.id.button32);
        Button button33 = (Button) findViewById(R.id.button33);
        Button button34 = (Button) findViewById(R.id.button34);
        Button button35 = (Button) findViewById(R.id.button35);
        Button button36 = (Button) findViewById(R.id.button36);

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am1 = new Intent(amcat.this,am1.class);
                startActivity(am1);
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am2 = new Intent(amcat.this,am2.class);
                startActivity(am2);
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am3 = new Intent(amcat.this,am3.class);
                startActivity(am3);
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am4 = new Intent(amcat.this,am4.class);
                startActivity(am4);
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am5 = new Intent(amcat.this,am5.class);
                startActivity(am5);
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am6 = new Intent(amcat.this,am6.class);
                startActivity(am6);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am7 = new Intent(amcat.this,am7.class);
                startActivity(am7);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am8 = new Intent(amcat.this,am8.class);
                startActivity(am8);
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am9 = new Intent(amcat.this,am9.class);
                startActivity(am9);
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am10 = new Intent(amcat.this,am10.class);
                startActivity(am10);
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am11 = new Intent(amcat.this,am11.class);
                startActivity(am11);
            }
        });






    }
}
