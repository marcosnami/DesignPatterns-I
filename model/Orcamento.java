package com.alura.designpatterns1.model;

import com.alura.designpatterns1.desconto.EmAprovacao;
import com.alura.designpatterns1.desconto.EstadoDeUmOrcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by MarcosNami on 9/23/2017.
 */
public class Orcamento {

    private double valor;
    private EstadoDeUmOrcamento estadoAtual;
    private final List<Item> items;

    public Orcamento(double valor) {
        this.valor = valor;
        this.estadoAtual = new EmAprovacao();
        this.items = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }
}

