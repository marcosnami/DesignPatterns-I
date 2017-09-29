package com.alura.designpatterns1;

import com.alura.designpatterns1.imposto.ICCC;
import com.alura.designpatterns1.imposto.ICMS;
import com.alura.designpatterns1.imposto.ISS;
import com.alura.designpatterns1.imposto.ImpostoMuitoAlto;
import com.alura.designpatterns1.model.Imposto;
import com.alura.designpatterns1.model.Orcamento;
import com.alura.designpatterns1.regras.CalculadorDeImpostos;

import java.util.Random;

/**
 * Created by MarcosNami on 9/23/2017.
 */
public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto iccc = new ICCC();

        Imposto impostoComplexo = new ISS(new ICMS());
        Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new ICMS(new ISS()));

        Orcamento orcamento = new Orcamento(500.00);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        calculador.realizaCalculo(orcamento, icms);
        calculador.realizaCalculo(orcamento, iss);

        calculador.realizaCalculo(orcamento, iccc);

        double imposto = impostoComplexo.calcula(orcamento);
        System.out.println("Imposto Complexo: " + imposto);

        double imposto2 = impostoMuitoAlto.calcula(orcamento);
        System.out.println("Imposto Muito Alto: " + imposto2);
    }
}
