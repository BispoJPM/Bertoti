package Padroes.Strategy.Pattern;

class Produto {
    private String nome;
    private double preco;
    private Desconto desconto;

    public Produto(String nome, double preco, Desconto desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double precoFinal() {
        return desconto.calcular(preco);
    }
}