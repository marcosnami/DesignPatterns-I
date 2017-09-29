package com.alura.designpatterns1.desconto;

import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class EmAprovacao implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!descontoAplicado) {
            orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
            descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
    }
}
