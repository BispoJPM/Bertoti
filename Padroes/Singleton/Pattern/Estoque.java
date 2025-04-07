package Padroes.Singleton.Pattern;

class Estoque {
    private static Estoque instancia;

    private Estoque() {
        System.out.println("Estoque criado.");
    }

    public static Estoque getInstancia() {
        if (instancia == null) {
            instancia = new Estoque();
        }
        return instancia;
    }

    public void exibirMensagem() {
        System.out.println("Gerenciando o estoque...");
    }
}