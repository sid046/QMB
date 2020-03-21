package com.animation.qmb;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.animation.qmb.bca.Cam;
import com.animation.qmb.diplomaa.diploma;
import com.animation.qmb.mca.mcam;

import androidx.appcompat.app.AppCompatActivity;

public class course extends AppCompatActivity {

    TextView btech,dip,bsc,management,bca,pharmacy,msc,mtech,mca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);


        btech=findViewById(R.id.btech);
        dip=findViewById(R.id.dip);
        bsc = findViewById(R.id.bsc);
        management = findViewById(R.id.management);
        bca = findViewById(R.id.bca);
        pharmacy=findViewById(R.id.pharamcy);
        msc=findViewById(R.id.msc);
        mtech=findViewById(R.id.mtech);
        mca=findViewById(R.id.mca);

        btech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "btech");
                editor.apply();
                startActivity(new Intent(course.this, com.animation.qmb.betch.btech.class));
            }
        });

        dip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "dip");
                editor.apply();
                startActivity(new Intent(course.this, diploma.class));
            }
        });
//
        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bsc");
                editor.apply();

                startActivity(new Intent(course.this, com.animation.qmb.bsc.bsc.class));

            }
        });
//
        management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "management");
                editor.apply();
                startActivity(new Intent(course.this, com.animation.qmb.management.management.class));
            }
        });
//
//
        pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "pharmacy");
                editor.apply();
                startActivity(new Intent(course.this, pharmacy.class));
            }
        });
//

        msc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "msc");
                editor.apply();
                startActivity(new Intent(course.this, com.animation.qmb.msc.msc.class));
            }
        });

        mtech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "mtech");
                editor.apply();
                startActivity(new Intent(course.this, com.animation.qmb.metch.mtech.class));
            }
        });



        bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("Class", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bca");
                editor.apply();
                startActivity(new Intent(course.this, Cam.class));

            }
        });

        mca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "mca");
                editor.apply();
                startActivity(new Intent(course.this, mcam.class));
            }
        });
    }
}

