package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {
    private Button button;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        b = (Button) findViewById(R.id.button28);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity344();
                                 }
                             }
        );

        button = (Button) findViewById(R.id.button27);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity444();
            }
        }
        );
    }

    public void openActivity344() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    public void openActivity444() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}