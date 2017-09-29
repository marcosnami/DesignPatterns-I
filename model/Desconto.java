package com.alura.designpatterns1.model;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
