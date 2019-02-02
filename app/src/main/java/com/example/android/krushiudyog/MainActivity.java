package com.example.android.krushiudyog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText num=(EditText)findViewById(R.id.NEW);
        String str=num.getText().toString();



        EditText num1=(EditText)findViewById(R.id.new1);
        String phone=num1.getText().toString();
        Button ff=(Button)findViewById(R.id.next);
        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gg=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(gg);
            }
        });
            }
        }

