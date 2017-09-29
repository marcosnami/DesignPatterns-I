package com.alura.designpatterns1.desconto;

import com.alura.designpatterns1.model.Desconto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class DescontoPorMaisDeCincoItens implements Desconto {
    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItems().size() > 5) {
            return orcamento.getValor() * 0.1;
        } else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
