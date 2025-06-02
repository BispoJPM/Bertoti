package AntiPattern;

public class Observer {
    public static void main(String[] args) {
        Clientes c1 = new Clientes();
        Clientes c2 = new Clientes();
        Mercadinho m = new Mercadinho(c1, c2);
        m.novoProduto("Leite");
    }
}