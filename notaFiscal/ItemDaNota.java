package com.alura.designpatterns1.notaFiscal;

/**
 * Created by MarcosNami on 9/29/2017.
 */
public class ItemDaNota {

    private String descricao;
    private double valor;

    public ItemDaNota(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
