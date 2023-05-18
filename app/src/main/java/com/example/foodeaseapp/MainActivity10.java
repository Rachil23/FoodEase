package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {

    private Button button;
    private Button b;
    private Button bu;
    private Button but;
    private Button butto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        b = (Button) findViewById(R.id.button29);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                                     openActivity2434();
                                 }
        }
        );


        bu = (Button) findViewById(R.id.button30);
        bu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                                      openActivity2934();
                                  }
        }
        );
        bu = findViewById(R.id.button20);
        bu.setOnClickListener(this::onClick2);

        but = findViewById(R.id.button21);
        but.setOnClickListener(this::onClick3);

        butto = findViewById(R.id.button22);
        butto.setOnClickListener(this::onClick4);
    }
    public void openActivity2434(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void openActivity2934(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }


    public void onClick2(View view){
        Toast.makeText(MainActivity10.this,"Apple Pie added to order list", Toast.LENGTH_SHORT).show();
    }

    public void onClick3(View view){
        Toast.makeText(MainActivity10.this,"Pudding added to order list", Toast.LENGTH_SHORT).show();
    }

    public void onClick4(View view){
        Toast.makeText(MainActivity10.this,"Ice Cream added to order list", Toast.LENGTH_SHORT).show();
    }
}