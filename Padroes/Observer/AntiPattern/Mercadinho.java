package Padroes.Observer.AntiPattern;

class Mercadinho {
    private Cliente cliente1;
    private Cliente cliente2;

    public Mercadinho(Cliente c1, Cliente c2) {
        this.cliente1 = c1;
        this.cliente2 = c2;
    }

    public void novoProduto(String produto) {
        cliente1.receberNotificacao(produto);
        cliente2.receberNotificacao(produto);
    }
}