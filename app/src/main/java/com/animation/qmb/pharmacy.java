package com.animation.qmb;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.animation.qmb.pharma.bpharmam;
import com.animation.qmb.pharma.dpharmam;

import androidx.appcompat.app.AppCompatActivity;

public class pharmacy extends AppCompatActivity {

    TextView bpharma,dpharma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pharmacy);


        bpharma=findViewById(R.id.bpharma);
        dpharma=findViewById(R.id.dpharma);
        

        bpharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bpharma");
                editor.apply();
                startActivity(new Intent(pharmacy.this, bpharmam.class));
            }
        });

        dpharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "diploma");
                editor.apply();
                startActivity(new Intent(pharmacy.this, dpharmam.class));
            }
        });

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

