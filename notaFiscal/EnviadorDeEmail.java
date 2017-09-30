package com.alura.designpatterns1.notaFiscal;

/**
 * Created by MarcosNami on 9/29/2017.
 */
public class EnviadorDeEmail implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("enviando por e-mail");
    }
}
