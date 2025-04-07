package Padroes.Observer.AntiPattern;

public class ObserverAntiPattern {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Mercadinho m = new Mercadinho(c1, c2);
        m.novoProduto("Leite");
    }
}