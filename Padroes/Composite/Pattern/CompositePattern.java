package Padroes.Composite.Pattern;

public class CompositePattern {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz");
        Produto feijao = new Produto("Feijão");
        Caixa caixa = new Caixa();
        caixa.adicionar(arroz);
        caixa.adicionar(feijao);
        caixa.exibir();
    }
}