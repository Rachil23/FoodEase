package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Button b;
    private Button bu;
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity2();
                }
        });

        b = (Button) findViewById(R.id.button9);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity6();
            }
        });

        bu = findViewById(R.id.button4);
        bu.setOnClickListener(this);

        but = findViewById(R.id.button5);
        but.setOnClickListener(this::onClick2);

    }
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void openActivity6() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    public void onClick(View view){
        Toast.makeText(MainActivity2.this,"Butter Paneer added to order list", Toast.LENGTH_SHORT).show();
    }

    public void onClick2(View view){
        Toast.makeText(MainActivity2.this,"Dal Makhani added to order list", Toast.LENGTH_SHORT).show();
    }
}