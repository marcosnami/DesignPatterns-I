package com.alura.designpatterns1.relatorio;

import com.alura.designpatterns1.model.Conta;
import com.alura.designpatterns1.regras.TemplateDeRelatorio;

import java.util.Calendar;
import java.util.List;

/**
 * Created by MarcosNami on 9/27/2017.
 */
public class RelatorioComplexo extends TemplateDeRelatorio {
    @Override
    protected void cabecario() {
        System.out.println("Banco XYZ");
        System.out.println("Avenida Paulista, 1234");
        System.out.println("(11) 1234-5678");
    }

    @Override
    protected void rodape() {
        System.out.println("banco@xyz.com.br");
        System.out.println(Calendar.getInstance().getTime());
    }

    @Override
    protected void corpo(List<Conta> contas) {
        for(Conta conta : contas) {
            System.out.println(conta.getTitular() + " - " + "conta.getNumero()" + " - " +
                    "conta.getAgencia()" + " - " + conta.getSaldo());
        }
    }
}
