package com.alura.designpatterns1.desconto;

import com.alura.designpatterns1.model.Desconto;
import com.alura.designpatterns1.model.Item;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class DescontoPorVendaCasada implements Desconto {
    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (aconteceuVendaCasadaEm(orcamento)) {
            return orcamento.getValor() * 0.05;
        } else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
        return existe("Caneta", orcamento) && existe("Lapis", orcamento);
    }

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItems()) {
            if (item.getNome().equals(nomeDoItem)) {
                return true;
            }
        }
        return false;
    }
}
