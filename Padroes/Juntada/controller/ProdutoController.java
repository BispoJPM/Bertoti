package controller;

import strategy.Acao;

public class ProdutoController {
    private Acao acao;

    public ProdutoController(Acao acao) {
        this.acao = acao;
    }

    public void executarAcao(String entrada) {
        acao.executar(entrada);
    }
}
