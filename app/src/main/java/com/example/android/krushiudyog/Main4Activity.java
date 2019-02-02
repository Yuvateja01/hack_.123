package com.example.android.krushiudyog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        TextView num3 = (TextView) findViewById(R.id.v);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numintent3 = new Intent(Main4Activity.this, Main2Activity.class);
                startActivity(numintent3);


                TextView num4 = (TextView) findViewById(R.id.va);
                num4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent numintent4 = new Intent(Main4Activity.this, Main2Activity.class);
                        startActivity(numintent4);

                        TextView num5 = (TextView) findViewById(R.id.v2);
                        num5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent numintent5 = new Intent(Main4Activity.this, Main2Activity.class);
                                startActivity(numintent5);
                            }
                        });
                    }
                });
            }
        });
    }
}
