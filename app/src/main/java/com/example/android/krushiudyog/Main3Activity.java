package com.example.android.krushiudyog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView num5 = (TextView) findViewById(R.id.a);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numintent6 = new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(numintent6);


                TextView num6 = (TextView) findViewById(R.id.a1);
                num6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent numintent7 = new Intent(Main3Activity.this, Main5Activity.class);
                        startActivity(numintent7);

                        TextView num7 = (TextView) findViewById(R.id.a2);
                        num7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent numintent8 = new Intent(Main3Activity.this, Main5Activity.class);
                                startActivity(numintent8);
                            }
                        });
                    }
                });
            }
        });
    }
}
