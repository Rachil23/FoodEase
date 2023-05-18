package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    private Button button;
    private Button b;
    private Button bu;
    private Button but;
    private Button butto;
    private Button bt;

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
        bu = findViewById(R.id.button23);
        bu.setOnClickListener(this::onClick2);

        but = findViewById(R.id.button24);
        but.setOnClickListener(this::onClick3);

        butto = findViewById(R.id.button25);
        butto.setOnClickListener(this::onClick4);

        bt = findViewById(R.id.button26);
        bt.setOnClickListener(this::onClick5);
    }

    public void openActivity344() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    public void openActivity444() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void onClick2(View view){
        Toast.makeText(MainActivity8.this,"Coffee added to order list", Toast.LENGTH_SHORT).show();
    }

    public void onClick3(View view){
        Toast.makeText(MainActivity8.this,"Redbull added to order list", Toast.LENGTH_SHORT).show();
    }

    public void onClick4(View view){
        Toast.makeText(MainActivity8.this,"Sprite added to order list", Toast.LENGTH_SHORT).show();
    }

    public void onClick5(View view){
        Toast.makeText(MainActivity8.this,"Sting added to order list", Toast.LENGTH_SHORT).show();
    }
}