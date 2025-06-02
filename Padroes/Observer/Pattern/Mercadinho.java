package Pattern;

import java.util.*;

class Mercadinho {
    private List<Observer> clientes = new ArrayList<>();

    public void adicionarCliente(Observer cliente) {
        clientes.add(cliente);
    }

    public void novoProduto(String produto) {
        for (Observer cliente : clientes) {
            cliente.atualizar(produto);
        }
    }
}