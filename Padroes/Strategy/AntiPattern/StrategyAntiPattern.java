package Padroes.Strategy.AntiPattern;

public class StrategyAntiPattern {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 20.0, "Natal");
        Produto p2 = new Produto("Feijão", 10.0, "Fiel");
        System.out.println(p1.precoFinal());
        System.out.println(p2.precoFinal());
    }
}