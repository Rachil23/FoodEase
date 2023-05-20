package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    private Button button;
    private Button b;
    private Button bu;
    private Button but;
    private Button butto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        button = (Button) findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                                          openActivity203();
                                      }
            }
        );

        b = (Button) findViewById(R.id.button12);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                                          openActivity24();
                                      }
            }
        );


        bu = (Button) findViewById(R.id.button13);
        bu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                                     openActivity2129();
                                 }
            }
        );

        but = (Button) findViewById(R.id.button16);
        but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                                     openActivity44();
                                 }
                             }
        );

        butto = (Button) findViewById(R.id.button15);
        butto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                                     openActivity594();
                                 }
        }
        );

    }
    public void openActivity203(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity24(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void openActivity2129(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivity44(){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
    public void openActivity594() {
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }
}