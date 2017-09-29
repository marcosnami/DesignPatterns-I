package com.alura.designpatterns1.imposto;

import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Item;
import com.alura.designpatterns1.model.Orcamento;
import com.alura.designpatterns1.regras.TemplateDeImpostoCondicional;

/**
 * Created by MarcosNami on 9/27/2017.
 */
public class IKCV extends TemplateDeImpostoCondicional {

    public IKCV() {}

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for (Item item : orcamento.getItems()) {
            if (item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }
}
