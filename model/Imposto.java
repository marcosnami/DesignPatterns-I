package com.alura.designpatterns1.model;

import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/23/2017.
 */
public abstract class Imposto {

    protected final Imposto outroImposto;

    public Imposto() {
        this.outroImposto = null;
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected double calculoDoOutroImposto(Orcamento orcamento) {
        return outroImposto == null? 0 : outroImposto.calcula(orcamento);
    }

    public abstract double calcula(Orcamento orcamento);
}
