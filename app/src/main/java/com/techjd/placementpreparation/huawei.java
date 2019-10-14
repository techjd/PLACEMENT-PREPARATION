package com.techjd.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class huawei extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huawei);

        Button button41 = findViewById(R.id.button41);
        Button button42 = findViewById(R.id.button42);

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h1 = new Intent(huawei.this,hu1.class);
                startActivity(h1);
            }
        });

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h2 = new Intent(huawei.this,hu2.class);
                startActivity(h2);
            }
        });
    }
}
