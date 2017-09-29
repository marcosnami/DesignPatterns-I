package com.alura.designpatterns1.regras;

import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/27/2017.
 */
public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional() {
        super();
    }

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public final double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    public abstract double minimaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
