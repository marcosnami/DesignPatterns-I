package com.alura.designpatterns1.filtro;

import com.alura.designpatterns1.model.Conta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class FiltroMaiorQue500MilReais extends Filtro {

    public FiltroMaiorQue500MilReais() {
        super();
    }

    public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrada = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getSaldo() > 500000) {
                filtrada.add(conta);
            }
        }
        filtrada.addAll(proximo(contas));
        return filtrada;
    }
}
