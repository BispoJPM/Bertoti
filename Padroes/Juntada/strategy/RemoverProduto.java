package strategy;

import model.ProdutoModel;

public class RemoverProduto implements Acao {
    private ProdutoModel model;

    public RemoverProduto(ProdutoModel model) {
        this.model = model;
    }

    @Override
    public void executar(String entrada) {
        model.removerProduto(entrada);
    }
}

