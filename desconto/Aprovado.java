package com.alura.designpatterns1.desconto;

import com.alura.designpatterns1.model.Orcamento;

/**
 * Created by MarcosNami on 9/28/2017.
 */
public class Aprovado implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!descontoAplicado) {
            orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.02);
        }else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está em estado de aprovação");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
