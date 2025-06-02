package AntiPattern;

class Mercadinho {
    private Clientes cliente1;
    private Clientes cliente2;

    public Mercadinho(Clientes c1, Clientes c2) {
        this.cliente1 = c1;
        this.cliente2 = c2;
    }

    public void novoProduto(String produto) {
        cliente1.receberNotificacao(produto);
        cliente2.receberNotificacao(produto);
    }
}