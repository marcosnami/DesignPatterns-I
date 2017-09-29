package com.alura.designpatterns1;

import com.alura.designpatterns1.investimento.Arrojado;
import com.alura.designpatterns1.investimento.Conservador;
import com.alura.designpatterns1.investimento.Moderado;
import com.alura.designpatterns1.model.Conta;
import com.alura.designpatterns1.model.Investimento;
import com.alura.designpatterns1.regras.RealizadorDeInvestimentos;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class TesteDeInvestimentos {

    public static void main(String[] args) {
        Investimento moderado = new Moderado();
        Investimento conservador = new Conservador();
        Investimento arrojado = new Arrojado();

        Conta conta = new Conta("Marcos", 500.0);
        conta.deposita(1000.0);

        RealizadorDeInvestimentos investe = new RealizadorDeInvestimentos();
        investe.realiza(conta, moderado);
    }
}
