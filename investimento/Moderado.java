package com.alura.designpatterns1.investimento;

import com.alura.designpatterns1.model.Conta;
import com.alura.designpatterns1.model.Investimento;

import java.util.Random;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class Moderado implements Investimento {

    private Random random;

    public Moderado() {
        this.random = new Random();
    }

    @Override
    public double calcula(Conta conta) {

        if (random.nextInt(2) == 0) {
            return conta.getSaldo() * 0.025;
        } else {
            return conta.getSaldo() * 0.07;
        }

    }
}
