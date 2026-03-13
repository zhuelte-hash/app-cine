package com.example.appcine;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Snacks extends AppCompatActivity {

    CheckBox canchita, gaseosa, nachos, chocolate;
    Button btnPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        canchita = findViewById(R.id.canchita);
        gaseosa = findViewById(R.id.gaseosa);
        nachos = findViewById(R.id.nachos);
        chocolate = findViewById(R.id.chocolate);
        btnPagar = findViewById(R.id.btnPagar);

        btnPagar.setOnClickListener(v -> {

            String snacks = "";

            if (canchita.isChecked()) {
                snacks += "Canchita ";
            }

            if (gaseosa.isChecked()) {
                snacks += "Gaseosa ";
            }

            if (nachos.isChecked()) {
                snacks += "Nachos ";
            }

            if (chocolate.isChecked()) {
                snacks += "Chocolate ";
            }

            Toast.makeText(this, "Snacks elegidos: " + snacks, Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Snacks.this, Confirmacion.class);
            startActivity(intent);
        });
    }
}