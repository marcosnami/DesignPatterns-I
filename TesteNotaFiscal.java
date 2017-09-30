package com.alura.designpatterns1;

import com.alura.designpatterns1.notaFiscal.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class TesteNotaFiscal {

    public static void main(String[] args) {
        List<AcaoAposGerarNota>  acoes = new ArrayList<>();
        NotaFiscal nf = new NotaFiscalBuilder(acoes).paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .comItem(new ItemDaNota("item 1", 100.0))
                .comItem(new ItemDaNota("item 2", 200.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacoes("entregar nf pessoalmente")
                .naDataAtual()
                .constroi();
    }
}
