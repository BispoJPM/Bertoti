package Padroes.Composite.AntiPattern;

public class CompositeAntiPattern {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz");
        Produto feijao = new Produto("Feijão");
        Caixa caixa = new Caixa(arroz, feijao);
        caixa.exibir();
    }
}