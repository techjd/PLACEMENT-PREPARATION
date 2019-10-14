package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lt);

        //60 to 65

        Button button60 = findViewById(R.id.button60);
        Button button61 = findViewById(R.id.button61);
        Button button62 = findViewById(R.id.button62);
        Button button63 = findViewById(R.id.button63);
        Button button64 = findViewById(R.id.button64);
        Button button65 = findViewById(R.id.button65);

        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lt1 = new Intent(lt.this,lt1.class);
                startActivity(lt1);
            }
        });

        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lt2 = new Intent(lt.this,lt2.class);
                startActivity(lt2);
            }
        });

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lt3 = new Intent(lt.this,lt3.class);
                startActivity(lt3);
            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lt4 = new Intent(lt.this,lt4.class);
                startActivity(lt4);
            }
        });

        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lt5 = new Intent(lt.this,lt5.class);
                startActivity(lt5);
            }
        });

        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lt6 = new Intent(lt.this,lt6.class);
                startActivity(lt6);
            }
        });
    }
}
