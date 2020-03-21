package com.animation.qmb.msc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.animation.qmb.R;

import androidx.appcompat.app.AppCompatActivity;

public class msc extends AppCompatActivity {

    TextView nut,agronomy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.msc);


        nut=findViewById(R.id.nut);
        agronomy=findViewById(R.id.agronomy);
        

        nut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "msc");
                editor.apply();
                startActivity(new Intent(msc.this, mnutm.class));
            }
        });


        agronomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "msc");
                editor.apply();
                startActivity(new Intent(msc.this, magrom.class));
            }
        });

    }
}

