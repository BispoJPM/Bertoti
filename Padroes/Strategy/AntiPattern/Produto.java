package Padroes.Strategy.AntiPattern;

class Produto {
    private String nome;
    private double preco;
    private String tipoDesconto;

    public Produto(String nome, double preco, String tipoDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoDesconto = tipoDesconto;
    }

    public double precoFinal() {
        if (tipoDesconto.equals("Natal")) {
            return preco * 0.9;
        } else if (tipoDesconto.equals("Fiel")) {
            return preco * 0.85;
        } else {
            return preco;
        }
    }
}