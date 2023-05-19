package com.example.foodeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Button b;

    EditText id_email;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        id_email=findViewById(R.id.delivery_address);
        button = findViewById(R.id.button7);
        button.setOnClickListener(this);

        b = (Button) findViewById(R.id.button31);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                                          openActivity644();
                                      }
        }
        );
    }

    public void onClick(View view){
        String d_address = id_email.getText().toString();
        if(d_address.length()==0)
        {
            Toast.makeText(MainActivity4.this,"Enter Address ", Toast.LENGTH_SHORT).show();
        }
        else{
        Toast.makeText(MainActivity4.this,"Order confirmed ", Toast.LENGTH_SHORT).show();}
    }
    public void openActivity644() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }


}