package com.alura.designpatterns1.desconto;

import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class Finalizado implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento está em estado de finalização e não pode ser aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento está em estado de finalização e não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento está em estado de finalização e não pode ser finalizado");
    }
}
