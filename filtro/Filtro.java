package com.alura.designpatterns1.filtro;

import com.alura.designpatterns1.model.Conta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public abstract class Filtro {
    protected Filtro outroFiltro;

    public Filtro() {
    }

    public Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> proximo(List<Conta> contas) {
        if (outroFiltro != null) {
            return outroFiltro.filtra(contas);
        } else {
            return new ArrayList<>(contas);
        }
    }
}
