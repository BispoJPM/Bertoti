package AntiPattern;

class Caixas {
    private Produtos produto1;
    private Produtos produto2;

    public Caixas(Produtos p1, Produtos p2) {
        this.produto1 = p1;
        this.produto2 = p2;
    }

    public void exibir() {
        produto1.exibir();
        produto2.exibir();
    }
}