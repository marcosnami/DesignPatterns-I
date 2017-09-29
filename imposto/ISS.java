package com.alura.designpatterns1.imposto;

import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/23/2017.
 */
public class ISS extends Imposto {

    public ISS() {
        super();
    }

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
    }

}
