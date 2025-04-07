package Padroes.Singleton.Pattern;

public class SingletonPattern {
    public static void main(String[] args) {
        Estoque e1 = Estoque.getInstancia();
        Estoque e2 = Estoque.getInstancia();
        e1.exibirMensagem();
        System.out.println(e1 == e2);
    }
}