package AntiPattern;

public class Componente {
    public static void main(String[] args) {
        Produtos arroz = new Produtos("Arroz");
        Produtos feijao = new Produtos("Feijão");
        Caixas caixa = new Caixas(arroz, feijao);
        caixa.exibir();
    }
}