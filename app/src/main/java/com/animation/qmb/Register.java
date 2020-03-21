package com.animation.qmb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;


public class Register extends AppCompatActivity {




    EditText mobilen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mobilen = findViewById(R.id.MOBILE);

        findViewById(R.id.buttonPanel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = mobilen.getText().toString().trim();

                if (mobile.isEmpty() || mobile.length() < 10) {
                    mobilen.setError("Enter a valid mobile");
                    mobilen.requestFocus();
                    return;
                }

                Intent intent = new Intent(Register.this, verify.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);
            }
        });


    }

}

