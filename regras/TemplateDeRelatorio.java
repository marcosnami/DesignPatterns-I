package com.alura.designpatterns1.regras;

import com.alura.designpatterns1.model.Conta;

import java.util.List;

/**
 * Created by MarcosNami on 9/27/2017.
 */
public abstract class TemplateDeRelatorio {
    protected abstract void cabecario();
    protected abstract void rodape();
    protected abstract void corpo(List<Conta> contas);

    public void imprime(List<Conta> contas) {
        cabecario();
        corpo(contas);
        rodape();
    }
}
