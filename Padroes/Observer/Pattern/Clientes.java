package Pattern;

class Clientes implements Observers {
    private String nome;

    public Clientes(String nome) {
        this.nome = nome;
    }

    public void atualizar(String produto) {
        System.out.println(nome + " foi notificado: Novo produto disponível - " + produto);
    }
}