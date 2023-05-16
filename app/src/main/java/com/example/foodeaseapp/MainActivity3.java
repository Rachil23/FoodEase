package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private Button button;
    private Button b;
    private Button bu;
    private Button but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        b = (Button) findViewById(R.id.button8);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });

        bu = (Button) findViewById(R.id.button8);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity21();
            }

        });
        but = findViewById(R.id.button2);
        but.setOnClickListener(this::onClick2);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void openActivity7(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void openActivity21(){
            Intent intent = new Intent(this, MainActivity7.class);
            startActivity(intent);
        }


    public void onClick2(View view){
        Toast.makeText(MainActivity3.this,"Salad added to order list", Toast.LENGTH_SHORT).show();
    }
}