package Padroes.Strategy.Pattern;

class DescontoClienteFiel implements Desconto {
    public double calcular(double preco) {
        return preco * 0.85;
    }
}