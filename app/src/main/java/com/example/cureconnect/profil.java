package com.example.cureconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);


        ImageView imageView =findViewById(R.id.notification);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profil.this, guide.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 =findViewById(R.id.accueil);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(profil.this, home.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 =findViewById(R.id.settings);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(profil.this, setting.class);
                startActivity(intent);
            }
        });







    }
}