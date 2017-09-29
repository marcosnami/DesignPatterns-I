package com.alura.designpatterns1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by MarcosNami on 9/23/2017.
 */
public class Orcamento {

    private final double valor;
    private final List<Item> items;

    public Orcamento(double valor) {
        this.valor = valor;
        this.items = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }
}

