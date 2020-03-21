package com.animation.qmb;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = getSharedPreferences("UserLogin",MODE_PRIVATE);
        final String Status =sharedPreferences.getString("Status","");


        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                if (Status != ""){
                    Intent i = new Intent(MainActivity.this, course.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Intent i = new Intent(MainActivity.this, Register.class);
                    startActivity(i);
                   finish();
                }
                 //This method will be executed once the timer is over

            }
        }, 2000);
    }
}
