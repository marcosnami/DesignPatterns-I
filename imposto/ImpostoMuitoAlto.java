package com.alura.designpatterns1.imposto;

import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/27/2017.
 */
public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto() {
        super();
    }

    public ImpostoMuitoAlto(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
    }
}
