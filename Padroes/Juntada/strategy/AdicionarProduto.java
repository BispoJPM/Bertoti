package strategy;

import model.ProdutoModel;

public class AdicionarProduto implements Acao {
    private ProdutoModel model;

    public AdicionarProduto(ProdutoModel model) {
        this.model = model;
    }

    @Override
    public void executar(String entrada) {
        model.adicionarProduto(entrada);
    }
}
