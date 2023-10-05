package com.example.pm01_ejercicio1_1_gustavobrocato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView txtResultado, txtInstruccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = (TextView) findViewById(R.id.txtViewResultado2);
        txtInstruccion = (TextView) findViewById(R.id.txtViewResultado);

        Intent intentResultado = getIntent();
        String tipo = intentResultado.getStringExtra("tipo");
        if(tipo.equals("Division")){
            double doubleResultado = intentResultado.getDoubleExtra("resultado", 1.0);
            txtInstruccion.setText("El resultado de la "+tipo+" es:");
            txtResultado.setText(String.valueOf(doubleResultado));
        }else{
            int intResultado = intentResultado.getIntExtra("resultado", 0);
            txtInstruccion.setText("El resultado de la "+tipo+" es:");
            txtResultado.setText(String.valueOf(intResultado));
        }
    }
}