package com.alura.designpatterns1.model;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class Item {

    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
