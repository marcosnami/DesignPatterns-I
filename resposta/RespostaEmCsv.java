package com.alura.designpatterns1.resposta;

import com.alura.designpatterns1.model.Conta;
import com.alura.designpatterns1.model.Requisicao;
import com.alura.designpatterns1.model.Resposta;
import com.alura.designpatterns1.utils.Formato;

/**
 * Created by MarcosNami on 9/24/2017.
 */
public class RespostaEmCsv implements Resposta {
    private Resposta resposta;

    public RespostaEmCsv(Resposta resposta) {
        this.resposta = resposta;
    }

    @Override
    public void responde(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.CSV) {
            System.out.println(conta.getTitular() + "," + conta.getSaldo());
        } else {
            resposta.responde(requisicao, conta);
        }
    }
}
