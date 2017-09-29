package com.alura.designpatterns1.model;

import java.util.Calendar;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class Conta {

    private String titular;
    private double saldo;
    private Calendar dataAbertura;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }
}
