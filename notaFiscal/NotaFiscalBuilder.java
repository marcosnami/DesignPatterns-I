package com.alura.designpatterns1.notaFiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private double impostos;
    private Calendar data;
    private String observacoes;

    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();

    public NotaFiscalBuilder() {
        this.data = Calendar.getInstance();
    }

    public NotaFiscalBuilder naData(Calendar novaData) {
        this.data = novaData;

        return this;
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this; // retorno eu mesmo, o próprio builder, para que o cliente continue utilizando
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }


    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = Calendar.getInstance();
        return this;
    }

    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
    }
}