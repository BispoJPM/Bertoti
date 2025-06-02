package Pattern;

class Produtos {
    private String nome;
    private double preco;
    private Desconto desconto;

    public Produtos(String nome, double preco, Desconto desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double precoFinal() {
        return desconto.calcular(preco);
    }
}