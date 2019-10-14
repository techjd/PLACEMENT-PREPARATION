package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        Button button16 = findViewById(R.id.button16);
        Button button17 = findViewById(R.id.button17);
        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button52 = findViewById(R.id.button52);

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd16 = new Intent(code.this,cod1.class);
                startActivity(cd16);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd17 = new Intent(code.this,cod2.class);
                startActivity(cd17);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd18 = new Intent(code.this,cod3.class);
                startActivity(cd18);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd19 = new Intent(code.this,cod4.class);
                startActivity(cd19);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd20 = new Intent(code.this,cod5.class);
                startActivity(cd20);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd21 = new Intent(code.this,cod6.class);
                startActivity(cd21);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd22 = new Intent(code.this,cod7.class);
                startActivity(cd22);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd23 = new Intent(code.this,cod8.class);
                startActivity(cd23);
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd52 = new Intent(code.this,cod9.class);
                startActivity(cd52);
            }
        });

    }
}
