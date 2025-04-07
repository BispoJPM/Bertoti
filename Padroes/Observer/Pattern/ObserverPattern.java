package Padroes.Observer.Pattern;

public class ObserverPattern {
    public static void main(String[] args) {
        Mercadinho m = new Mercadinho();
        m.adicionarCliente(new Cliente("João"));
        m.adicionarCliente(new Cliente("Maria"));
        m.novoProduto("Café");
    }
}