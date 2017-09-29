package com.alura.designpatterns1.model;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class Negativo implements EstadoDaConta {
    @Override
    public void saca(Conta conta, double valor) {
        throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.saldo += valor * 0.95;
        if(conta.saldo > 0) {
            conta.estado = new Positivo();
        }
    }
}
