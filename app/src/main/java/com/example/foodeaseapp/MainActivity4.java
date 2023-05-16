package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button = findViewById(R.id.button7);
        button.setOnClickListener(this);
    }

    public void onClick(View view){
        Toast.makeText(MainActivity4.this,"Order confirmed ", Toast.LENGTH_SHORT).show();
    }
}