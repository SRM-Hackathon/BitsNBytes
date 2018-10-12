package com.example.kalikousik14.test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView button = (CardView) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myIntent = new Intent(getApplicationContext() , Main2Activity.class);
                startActivity(myIntent);
            }
        }
        );

} }
