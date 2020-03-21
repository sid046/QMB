package com.animation.qmb.bsc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.animation.qmb.R;

import androidx.appcompat.app.AppCompatActivity;

public class bsc extends AppCompatActivity {

    TextView agriculture,radiology,nutrition,physics,math,graphic,chemistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc);


        agriculture=findViewById(R.id.agri);
        radiology=findViewById(R.id.radiology);
        nutrition=findViewById(R.id.nutrition);
        physics=findViewById(R.id.physics);
        math=findViewById(R.id.math);
        graphic=findViewById(R.id.graphic);
        chemistry=findViewById(R.id.chemistry);


        agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bsc");
                editor.apply();
                startActivity(new Intent(bsc.this, agm.class));
            }
        });

        radiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bsc");
                editor.apply();
                startActivity(new Intent(bsc.this, radm.class));
            }
        });

        nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bsc");
                editor.apply();
                startActivity(new Intent(bsc.this, nutm.class));
            }
        });

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bsc");
                editor.apply();
                startActivity(new Intent(bsc.this, phym.class));
            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bsc");
                editor.apply();
                startActivity(new Intent(bsc.this, chm.class));
            }
        });

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bsc");
                editor.apply();
                startActivity(new Intent(bsc.this, mthm.class));
            }
        });

        graphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "bsc");
                editor.apply();
                startActivity(new Intent(bsc.this, grm.class));
            }
        });
    }
}


