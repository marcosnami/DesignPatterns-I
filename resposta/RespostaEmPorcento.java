package com.alura.designpatterns1.resposta;

import com.alura.designpatterns1.model.Conta;
import com.alura.designpatterns1.model.Requisicao;
import com.alura.designpatterns1.model.Resposta;
import com.alura.designpatterns1.utils.Formato;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class RespostaEmPorcento implements Resposta {
    private Resposta resposta;

    public RespostaEmPorcento() {
        this.resposta = null; // nao recebi a proxima!
    }

    public RespostaEmPorcento(Resposta resposta) {
        this.resposta = resposta;
    }

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.PORCENTO) {
            System.out.println(conta.getTitular() + "%" + conta.getSaldo());
        } else if (resposta != null) {
            resposta.responde(requisicao, conta);
        } else {
            // não existe próxima na corrente, e ninguém atendeu a requisição!
            // poderíamos não ter feito nada aqui, caso não fosse necessário!
            throw new RuntimeException("Formato de resposta não encontrado");
        }
    }
}
