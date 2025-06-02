package Pattern;

public class Componente {
    public static void main(String[] args) {
        Produtos arroz = new Produtos("Arroz");
        Produtos feijao = new Produtos("Feijão");
        Caixa caixa = new Caixa();
        caixa.adicionar(arroz);
        caixa.adicionar(feijao);
        caixa.exibir();
    }
}