package com.example.pm01_ejercicio1_1_gustavobrocato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtPrimerNumero, txtSegundoNumero;
    Button btnSumar, btnRestar, btnDividir, btnMultiplicar;

    Operaciones operaciones = new Operaciones();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPrimerNumero = (EditText) findViewById(R.id.txtPrimerNumero);
        txtSegundoNumero = (EditText) findViewById(R.id.txtSegundoNumero);
        btnSumar = (Button) findViewById(R.id.btnSuma);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtPrimerNumero.getText().toString().trim().isEmpty() || txtSegundoNumero.getText().toString().trim().isEmpty()){
                   txtPrimerNumero.setError("Porfavor ingrese un numero, no se permiten campos vacios!!!");
                    txtSegundoNumero.setError("Porfavor ingrese un numero, no se permiten campos vacios!!!");
                }else{
                    operaciones.setPrimerNumero(Integer.parseInt(txtPrimerNumero.getText().toString()));
                    operaciones.setSegundoNumero(Integer.parseInt(txtSegundoNumero.getText().toString()));
                    Intent intentResultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    intentResultado.putExtra("resultado", operaciones.suma());
                    intentResultado.putExtra("tipo", "Suma");
                    startActivity(intentResultado);
                }
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtPrimerNumero.getText().toString().trim().isEmpty() || txtSegundoNumero.getText().toString().trim().isEmpty()){
                    txtPrimerNumero.setError("Porfavor ingrese un numero, no se permiten campos vacios!!!");
                    txtSegundoNumero.setError("Porfavor ingrese un numero, no se permiten campos vacios!!!");
                }else{
                    operaciones.setPrimerNumero(Integer.parseInt(txtPrimerNumero.getText().toString()));
                    operaciones.setSegundoNumero(Integer.parseInt(txtSegundoNumero.getText().toString()));
                    Intent intentResultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    intentResultado.putExtra("resultado", operaciones.resta());
                    intentResultado.putExtra("tipo", "Resta");
                    startActivity(intentResultado);
                }
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtPrimerNumero.getText().toString().trim().isEmpty() || txtSegundoNumero.getText().toString().trim().isEmpty()){
                    txtPrimerNumero.setError("Porfavor ingrese un numero, no se permiten campos vacios!!!");
                    txtSegundoNumero.setError("Porfavor ingrese un numero, no se permiten campos vacios!!!");
                } else if (txtSegundoNumero.getText().toString().trim().equals("0")) {
                    txtSegundoNumero.setError("Las Divisiones por 0, no son permitidas");
                } else{
                    operaciones.setPrimerNumero(Integer.parseInt(txtPrimerNumero.getText().toString()));
                    operaciones.setSegundoNumero(Integer.parseInt(txtSegundoNumero.getText().toString()));
                    Intent intentResultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    intentResultado.putExtra("resultado", operaciones.division());
                    intentResultado.putExtra("tipo", "Division");
                    startActivity(intentResultado);
                }
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtPrimerNumero.getText().toString().trim().isEmpty() || txtSegundoNumero.getText().toString().trim().isEmpty()){
                    txtPrimerNumero.setError("Porfavor ingrese un numero, no se permiten campos vacios!!!");
                    txtSegundoNumero.setError("Porfavor ingrese un numero, no se permiten campos vacios!!!");
                }else{
                    operaciones.setPrimerNumero(Integer.parseInt(txtPrimerNumero.getText().toString()));
                    operaciones.setSegundoNumero(Integer.parseInt(txtSegundoNumero.getText().toString()));
                    Intent intentResultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    intentResultado.putExtra("resultado", operaciones.multiplicacion());
                    intentResultado.putExtra("tipo", "Multiplicacion");
                    startActivity(intentResultado);
                }
            }
        });


    }
}