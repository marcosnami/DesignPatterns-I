package com.alura.designpatterns1.imposto;

import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/23/2017.
 */
public class ICCC extends Imposto {

    public ICCC() {
        super();
    }

    public ICCC(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getValor() > 1000) {
            return orcamento.getValor() * 0.05;
        } else if (orcamento.getValor() > 3000) {
            return orcamento.getValor() * 0.07;
        } else {
            return orcamento.getValor() * 0.08 + 30;
        }
    }
}
