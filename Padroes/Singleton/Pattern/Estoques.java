package Pattern;

class Estoques {
    private static Estoques instancia;

    private Estoques() {
        System.out.println("Estoque criado.");
    }

    public static Estoques getInstancia() {
        if (instancia == null) {
            instancia = new Estoques();
        }
        return instancia;
    }

    public void exibirMensagem() {
        System.out.println("Gerenciando o estoque...");
    }
}