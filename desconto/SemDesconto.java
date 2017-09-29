package com.alura.designpatterns1.desconto;

import com.alura.designpatterns1.model.Desconto;
import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {

    }
}
