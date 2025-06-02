package AntiPattern;

class Produtos {
    private String nome;

    public Produtos(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Produto: " + nome);
    }
}