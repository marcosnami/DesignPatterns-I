package com.alura.designpatterns1;

import com.alura.designpatterns1.model.Item;
import com.alura.designpatterns1.model.Orcamento;
import com.alura.designpatterns1.regras.CalculadorDeDescontos;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.addItem(new Item("Caneta", 250.0));
        orcamento.addItem(new Item("Lapis", 250.0));
        orcamento.addItem(new Item("Borracha", 250.0));
        orcamento.addItem(new Item("Caderno", 250.0));

        double desconto = calculador.calcula(orcamento);
        System.out.println(desconto);
    }
}
