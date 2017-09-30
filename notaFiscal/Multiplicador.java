package com.alura.designpatterns1.notaFiscal;

/**
 * Created by MarcosNami on 9/29/2017.
 */
public class Multiplicador implements AcaoAposGerarNota {

    private final double fator;

    public Multiplicador(double fator) {
        this.fator = fator;
    }

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println(notaFiscal.getValorBruto() * this.fator);
    }
}
