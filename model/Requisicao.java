package com.alura.designpatterns1.model;

import com.alura.designpatterns1.utils.Formato;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class Requisicao {

    private Formato formato;

    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}
