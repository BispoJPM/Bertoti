package Pattern;

public class Singleton {
    public static void main(String[] args) {
        Estoque e1 = Estoque.getInstancia();
        Estoque e2 = Estoque.getInstancia();
        e1.exibirMensagem();
        System.out.println(e1 == e2);
    }
}