package com.alura.designpatterns1.imposto;

import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Orcamento;
import com.alura.designpatterns1.regras.TemplateDeImpostoCondicional;

/**
 * Created by MarcosNami on 9/27/2017.
 */
public class ICPP  extends TemplateDeImpostoCondicional {

    public ICPP() {}

    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}
