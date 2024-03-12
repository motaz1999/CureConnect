package com.example.cureconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class guide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);


        ImageView imageView1 =findViewById(R.id.settings);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(guide.this, setting.class);
                startActivity(intent);

            }
        });









        ImageView imageView3 =findViewById(R.id.accueil);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(guide.this, home.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 =findViewById(R.id.profil);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(guide.this, profil.class);
                startActivity(intent);
            }
        });
    }
}