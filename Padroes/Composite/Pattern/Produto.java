package Padroes.Composite.Pattern;

class Produto implements Item {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Produto: " + nome);
    }
}