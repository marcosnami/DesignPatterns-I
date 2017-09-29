package com.alura.designpatterns1.investimento;

import com.alura.designpatterns1.model.Conta;
import com.alura.designpatterns1.model.Investimento;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class Conservador implements Investimento {
    @Override
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
}
