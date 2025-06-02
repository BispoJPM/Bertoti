package AntiPattern;

public class Strategy {
    public static void main(String[] args) {
        Produtos p1 = new Produtos("Arroz", 20.0, "Natal");
        Produtos p2 = new Produtos("Feijão", 10.0, "Fiel");
        System.out.println(p1.precoFinal());
        System.out.println(p2.precoFinal());
    }
}