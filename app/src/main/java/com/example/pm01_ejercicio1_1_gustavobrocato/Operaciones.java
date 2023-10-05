package com.example.pm01_ejercicio1_1_gustavobrocato;

public class Operaciones {
    private int primerNumero;
    private int segundoNumero;

    public int getPrimerNumero() {
        return primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public int suma() {
        return primerNumero+segundoNumero;
    }

    public int resta(){
        return primerNumero-segundoNumero;
    }

    public double division() {
        double result = (double) primerNumero / (double) segundoNumero;
        return result;
    }

    public int multiplicacion(){
        return primerNumero*segundoNumero;
    }
}
