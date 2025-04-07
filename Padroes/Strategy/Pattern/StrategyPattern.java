package Padroes.Strategy.Pattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 20.0, new DescontoNatal());
        Produto p2 = new Produto("Feijão", 10.0, new DescontoClienteFiel());
        System.out.println(p1.precoFinal());
        System.out.println(p2.precoFinal());
    }
}