package Padroes.Composite.AntiPattern;

class Caixa {
    private Produto produto1;
    private Produto produto2;

    public Caixa(Produto p1, Produto p2) {
        this.produto1 = p1;
        this.produto2 = p2;
    }

    public void exibir() {
        produto1.exibir();
        produto2.exibir();
    }
}