package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView tvCount;
Button Button_add,Button_sub,Button_reset;
int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        Button_add = findViewById(R.id.button);
        Button_sub = findViewById(R.id.button1);
        Button_reset = findViewById(R.id.button2);




Button_add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        count = count+1;
        tvCount.setText(""+count);


    }
});


        Button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count = count-1;
                tvCount.setText(""+count);


            }
        });

        Button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count = 0;
                tvCount.setText(""+count);


            }
        });




    }
}