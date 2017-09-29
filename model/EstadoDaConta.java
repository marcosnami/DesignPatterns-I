package com.alura.designpatterns1.model;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public interface EstadoDaConta {
    void saca(Conta conta, double valor);
    void deposita(Conta conta, double valor);
}
