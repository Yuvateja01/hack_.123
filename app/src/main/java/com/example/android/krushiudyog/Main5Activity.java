package com.example.android.krushiudyog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button hh=(Button)findViewById(R.id.new2);
        hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yy=new Intent(Main5Activity.this,Main6Activity.class);
                startActivity(yy);
            }
        });

    }
}
