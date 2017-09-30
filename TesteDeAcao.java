package com.alura.designpatterns1;

import com.alura.designpatterns1.notaFiscal.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 9/29/2017.
 */
public class TesteDeAcao {

    public static void main(String[] args) {

        List<AcaoAposGerarNota> acoes = new ArrayList<>();
        acoes.add(new EnviadorDeEmail());
        acoes.add(new NotaFiscalDao());
        acoes.add(new EnviadorDeSms());
        acoes.add(new Impressora());
        acoes.add(new Multiplicador(2));
        acoes.add(new Multiplicador(3));
        acoes.add(new Multiplicador(5.5));

        NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .comItem(new ItemDaNota("item 1", 100.0))
                .comItem(new ItemDaNota("item 2", 200.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacoes("entregar notaFiscal pessoalmente")
                .naDataAtual()
                .constroi();

        System.out.println(notaFiscal.getValorBruto());
    }
}
