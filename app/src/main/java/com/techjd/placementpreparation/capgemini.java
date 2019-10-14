package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class capgemini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capgemini);

        Button button37 = (Button) findViewById(R.id.button37);
        Button button38 = (Button) findViewById(R.id.button38);

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cap1 = new Intent(capgemini.this,cap1.class);
                startActivity(cap1);
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cap2 = new Intent(capgemini.this,cap2.class);
                startActivity(cap2);
            }
        });
    }
}
