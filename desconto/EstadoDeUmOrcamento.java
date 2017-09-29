package com.alura.designpatterns1.desconto;

import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public interface EstadoDeUmOrcamento {
    void aplicaDescontoExtra(Orcamento orcamento);
    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);
}
