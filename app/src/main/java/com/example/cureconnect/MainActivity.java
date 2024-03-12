package com.example.cureconnect;

import static android.widget.Button.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.user);
        loginButton.setOnClickListener(v -> {
            // Create an Intent to start the LoginActivity
            Intent intent = new Intent(MainActivity.this, login.class);
            startActivity(intent);
        });




}



}