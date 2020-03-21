package com.animation.qmb.betch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.animation.qmb.R;

import androidx.appcompat.app.AppCompatActivity;

public class btech extends AppCompatActivity {

    TextView cse,me,ce,mte,pe,ee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech);


        cse=findViewById(R.id.cse);
        me=findViewById(R.id.me);
        ce = findViewById(R.id.ce);
        mte = findViewById(R.id.mte);
        pe = findViewById(R.id.pe);
        ee=findViewById(R.id.ee);


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "btech");
                editor.apply();
                startActivity(new Intent(btech.this, bcsem.class));
            }
        });

        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "btech");
                editor.apply();
                startActivity(new Intent(btech.this, bmem.class));
            }
        });

        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "btech");
                editor.apply();
                startActivity(new Intent(btech.this, bpem.class));
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "btech");
                editor.apply();
                startActivity(new Intent(btech.this, bcem.class));
            }
        });

        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "btech");
                editor.apply();
                startActivity(new Intent(btech.this, beem.class));
            }
        });

        mte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "btech");
                editor.apply();
                startActivity(new Intent(btech.this, bmtem.class));
            }
        });

//        diploma.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("course", "diploma");
//                editor.apply();
//                startActivity(new Intent(course.this, cs9.class));
//            }
//        });
//
//        bsc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("course", "bsc");
//                editor.apply();
//
//                startActivity(new Intent(course.this, profile.class));
//            }
//        });
//
//        management.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("course", "management");
//                editor.apply();
//                startActivity(new Intent(course.this, Stream11.class));
//            }
//        });
//
//
//        pharmacy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("course", "pharmacy");
//                editor.apply();
//                startActivity(new Intent(course.this, Stream12.class));
//            }
//        });
//
//        bca.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("course", "bca");
//                editor.apply();
//                startActivity(new Intent(course.this, Stream12.class));
//            }
//        });
//
//        msc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("course", "msc");
//                editor.apply();
//                startActivity(new Intent(course.this, Stream12.class));
//            }
//        });
    }
}

