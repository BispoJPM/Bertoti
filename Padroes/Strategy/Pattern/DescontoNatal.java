package Padroes.Strategy.Pattern;

class DescontoNatal implements Desconto {
    public double calcular(double preco) {
        return preco * 0.9;
    }
}