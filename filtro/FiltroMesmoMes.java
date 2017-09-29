package com.alura.designpatterns1.filtro;

import com.alura.designpatterns1.model.Conta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class FiltroMesmoMes extends Filtro {

    public FiltroMesmoMes() {
        super();
    }

    public FiltroMesmoMes(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrada = new ArrayList<>();
        for (Conta conta : contas) {
            if(conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) &&
                    conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
                filtrada.add(conta);
            }
        }
        filtrada.addAll(proximo(contas));
        return filtrada;
    }
}
