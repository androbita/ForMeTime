package com.ngopidevteam.pranadana.formetime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pilih_menu);

        Button btnWH = findViewById(R.id.btnWH);
        Button btnFT = findViewById(R.id.btnFT);
        Button btnMT = findViewById(R.id.btnMT);

        btnWH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ambilJam = new Intent(getApplicationContext(), AmbilJam.class);
                startActivity(ambilJam);
            }
        });

        btnFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ambilJam = new Intent(getApplicationContext(), AmbilJam.class);
                startActivity(ambilJam);
            }
        });

        btnMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ambilJam = new Intent(getApplicationContext(), AmbilJam.class);
                startActivity(ambilJam);
            }
        });
    }
}
