package com.alura.designpatterns1.regras;

import com.alura.designpatterns1.desconto.DescontoPorMaisDeCincoItens;
import com.alura.designpatterns1.desconto.DescontoPorMaisDeQuinhentosReais;
import com.alura.designpatterns1.desconto.DescontoPorVendaCasada;
import com.alura.designpatterns1.desconto.SemDesconto;
import com.alura.designpatterns1.model.Desconto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class CalculadorDeDescontos {

    public double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPorMaisDeCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        return d1.desconta(orcamento);
    }
}
