package com.example.coulomb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText q1, q1p, q2, q2P, dist;
TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
         q1 = findViewById(R.id.Q1);
         q1p = findViewById(R.id.Q1P);
         q2 = findViewById(R.id.Q2);
         q2P = findViewById(R.id.Q2P);
         dist = findViewById(R.id.distancia);
         resultado = findViewById(R.id.res);
    }
    public void Calcular(View v){
        int numero1 = Integer.parseInt(q1.getText().toString());
        int potencia1 = Integer.parseInt(q1p.getText().toString());
        int numero2 = Integer.parseInt(q2.getText().toString());
        int potencia2 = Integer.parseInt(q2P.getText().toString());
        double distanc = Double.parseDouble(dist.getText().toString());

        double notacao1 = Math.pow(10,potencia1);
        double notacao2 = Math.pow(10,potencia2);
        double k = 9*1000000000;
        double F = ((k*numero1*notacao1*numero2*notacao2)/distanc*distanc)*1000;
        String result = String.valueOf(F);
        resultado.setText(result);

        }
    }

