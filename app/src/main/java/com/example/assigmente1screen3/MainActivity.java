package com.example.assigmente1screen3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView l1= (TextView)findViewById(R.id.l1);
        TextView l2= (TextView)findViewById(R.id.L2);
        TextView r1= (TextView)findViewById(R.id.R1);
        TextView r2= (TextView)findViewById(R.id.r2);
        Button top=(Button)findViewById(R.id.top);
        Button cv=(Button)findViewById(R.id.cv);
        Button down=(Button)findViewById(R.id.down);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l2.setVisibility(View.INVISIBLE);
                r2.setVisibility(View.INVISIBLE);
            }
        });
     down.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             l1.setVisibility(View.INVISIBLE);
             r1.setVisibility(View.INVISIBLE);
         }
     });
     cv.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             l1.setVisibility(View.VISIBLE);
             l2.setVisibility(View.VISIBLE);
             r1.setVisibility(View.VISIBLE);
             r2.setVisibility(View.VISIBLE);
         }
     });



    }

}