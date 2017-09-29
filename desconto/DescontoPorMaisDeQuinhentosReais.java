package com.alura.designpatterns1.desconto;

import com.alura.designpatterns1.model.Desconto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class DescontoPorMaisDeQuinhentosReais implements Desconto {
    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500.0) {
            return orcamento.getValor() * 0.07;
        } else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
