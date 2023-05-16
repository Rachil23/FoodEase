package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    private Button button;
    private Button b;
    private Button but;
    private Button butt;
    private Button butto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        button = (Button) findViewById(R.id.button18);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                                          openActivity2();
                                      }
                }
        );

        b = (Button) findViewById(R.id.button19);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                                     openActivity25();
                                 }
        }
        );

        but = findViewById(R.id.button10);
        but.setOnClickListener(this::onClick2);

        butt = findViewById(R.id.button14);
        butt.setOnClickListener(this::onClick3);

        butto = findViewById(R.id.button17);
        butto.setOnClickListener(this::onClick4);
    }
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivity25(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void onClick2(View view){
        Toast.makeText(MainActivity6.this,"Pizza added to order list", Toast.LENGTH_SHORT).show();
    }
    public void onClick3(View view){
        Toast.makeText(MainActivity6.this,"French Fries added to order list", Toast.LENGTH_SHORT).show();
    }
    public void onClick4(View view){
        Toast.makeText(MainActivity6.this,"Burger added to order list", Toast.LENGTH_SHORT).show();
    }
}