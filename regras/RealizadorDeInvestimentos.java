package com.alura.designpatterns1.regras;

import com.alura.designpatterns1.model.Conta;
import com.alura.designpatterns1.model.Investimento;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class RealizadorDeInvestimentos {

    public void realiza(Conta conta, Investimento investimento) {
        double resultado = investimento.calcula(conta);

        conta.deposita(resultado * 0.75);
        System.out.println("Novo saldo: " + conta.getSaldo());
    }

}
