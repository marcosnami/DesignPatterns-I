package com.alura.designpatterns1.regras;

import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/23/2017.
 */
public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto estrategiaDeImposto) {
        double resultado = estrategiaDeImposto.calcula(orcamento);
        System.out.println(resultado);
    }

}
