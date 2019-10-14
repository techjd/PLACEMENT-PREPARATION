package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cognizant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cognizant);

        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cog1 = new Intent(cognizant.this,cog1.class);
                startActivity(cog1);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cog2 = new Intent(cognizant.this,cog2.class);
                startActivity(cog2);
            }
        });
    }
}
