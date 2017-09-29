package com.alura.designpatterns1.model;

import java.util.Calendar;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class Conta {

    private String titular;
    protected double saldo;
    private Calendar dataAbertura;
    protected EstadoDaConta estado;


    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.estado = new Positivo();
    }

    public void deposita(double valor) {
        this.saldo += valor;
        estado.deposita(this, valor);
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

    public void saca(double valor) {
        estado.saca(this, valor);
    }

}
