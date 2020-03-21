package com.animation.qmb.diplomaa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.animation.qmb.R;

import androidx.appcompat.app.AppCompatActivity;

public class diploma extends AppCompatActivity {

    TextView cse, me, ce, ee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma);


        cse = findViewById(R.id.cse);
        me = findViewById(R.id.me);
        ce = findViewById(R.id.ce);
        ee = findViewById(R.id.ee);


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "diploma");
                editor.apply();
                startActivity(new Intent(diploma.this, csem.class));
            }
        });

        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "diploma");
                editor.apply();
                startActivity(new Intent(diploma.this, mem.class));
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "diploma");
                editor.apply();
                startActivity(new Intent(diploma.this, csem.class));
            }
        });

        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "diploma");
                editor.apply();
                startActivity(new Intent(diploma.this, eem.class));
            }
        });
    }
}