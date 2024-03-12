package com.example.cureconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login); // Make sure this layout is correct


        Button loginnButton = findViewById(R.id.login);
        loginnButton.setOnClickListener(v -> {

            Intent intent = new Intent(login.this, home.class);
            startActivity(intent);
        });

        Button logiinnButton = findViewById(R.id.haveanaccount);
        logiinnButton.setOnClickListener(v -> {

            Intent intent = new Intent(login.this, register.class);
            startActivity(intent);
        });






    }

}
