package Pattern;

class Produtos implements Itens {
    private String nome;

    public Produtos(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Produto: " + nome);
    }
}