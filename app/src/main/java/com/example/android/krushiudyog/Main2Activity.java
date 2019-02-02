package com.example.android.krushiudyog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView num = (TextView) findViewById(R.id.vill);
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numintent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(numintent);


                TextView num1 = (TextView) findViewById(R.id.vill1);
                num1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent numintent1 = new Intent(Main2Activity.this, Main3Activity.class);
                        startActivity(numintent1);

                        TextView num2 = (TextView) findViewById(R.id.vill2);
                        num2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent numintent2 = new Intent(Main2Activity.this, Main3Activity.class);
                                startActivity(numintent2);
                            }
                        });
                    }
                });
            }
        });
    }
}