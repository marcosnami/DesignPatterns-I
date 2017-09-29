package com.alura.designpatterns1.imposto;

import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Item;
import com.alura.designpatterns1.model.Orcamento;
import com.alura.designpatterns1.regras.TemplateDeImpostoCondicional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 9/27/2017.
 */
public class IHIT extends TemplateDeImpostoCondicional {

    public IHIT(){}

    public IHIT(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItems().size());
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<>();
        for (Item item : orcamento.getItems()) {
            if (noOrcamento.contains(item.getNome())) {
                return true;
            } else {
                noOrcamento.add(item.getNome());
            }
        }
        return false;
    }
}
