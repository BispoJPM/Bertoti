package model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoModel {
    private List<String> produtos = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void adicionarProduto(String produto) {
        produtos.add(produto);
        notificar();
    }

    public void removerProduto(String produto) {
        produtos.remove(produto);
        notificar();
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    private void notificar() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
