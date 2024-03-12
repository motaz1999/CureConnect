package com.example.cureconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ImageView imageView =findViewById(R.id.notification);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(setting.this, guide.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 =findViewById(R.id.accueil);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(setting.this, home.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 =findViewById(R.id.profil);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(setting.this, profil.class);
                startActivity(intent);
            }
        });
    }
}