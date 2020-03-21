package com.animation.qmb.metch;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.animation.qmb.R;

import androidx.appcompat.app.AppCompatActivity;

public class mtech extends AppCompatActivity {

    TextView cse,me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mtech);


        cse=findViewById(R.id.cse);
        me=findViewById(R.id.me);
        

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "mtech");
                editor.apply();
                startActivity(new Intent(mtech.this,mcsem.class));
            }
        });

        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("course", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("course", "mtech");
                editor.apply();
                startActivity(new Intent(mtech.this,mmem.class));
            }
        });
    }
}

