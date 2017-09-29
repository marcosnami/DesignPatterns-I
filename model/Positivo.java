package com.alura.designpatterns1.model;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class Positivo implements EstadoDaConta {
    @Override
    public void saca(Conta conta, double valor) {
        conta.saldo -= valor;

        if(conta.saldo < 0) {
            conta.estado = new Negativo();
        }
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.saldo += valor * 0.98;
    }
}
