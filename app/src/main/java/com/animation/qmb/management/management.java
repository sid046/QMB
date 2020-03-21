package com.animation.qmb.management;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.animation.qmb.R;

import androidx.appcompat.app.AppCompatActivity;

public class management extends AppCompatActivity {

    TextView bba,bcom,bjmc,mba,llb,bhm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.management);


        bba=findViewById(R.id.bba);
        bcom=findViewById(R.id.bcom);
        bjmc = findViewById(R.id.bjmc);
        mba = findViewById(R.id.mba);
        llb = findViewById(R.id.llb);
        bhm =findViewById(R.id.bhm);


        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "management");
                editor.apply();
                startActivity(new Intent(management.this, bbam.class));
            }
        });

        bcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "management");
                editor.apply();
                startActivity(new Intent(management.this, bcom.class));
            }
        });


        bjmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "management");
                editor.apply();
                startActivity(new Intent(management.this, bjmcm.class));
            }
        });

        mba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "management");
                editor.apply();
                startActivity(new Intent(management.this, mbam.class));
            }
        });

        llb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "management");
                editor.apply();
                startActivity(new Intent(management.this, llbm.class));
            }
        });

        bhm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "management");
                editor.apply();
                startActivity(new Intent(management.this, bhmm.class));
            }
        });
    }
}

