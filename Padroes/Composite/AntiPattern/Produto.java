package Padroes.Composite.AntiPattern;

class Produto {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Produto: " + nome);
    }
}