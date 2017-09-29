package com.alura.designpatterns1.filtro;

import com.alura.designpatterns1.model.Conta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class FiltroMenorQue100Reais extends Filtro {
    public FiltroMenorQue100Reais() {
        super();
    }

    public FiltroMenorQue100Reais(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrada = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getSaldo() < 100) {
                filtrada.add(conta);
            }
        }
        filtrada.addAll(proximo(contas));
        return filtrada;
    }
}
