package Padroes.Observer.Pattern;

class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void atualizar(String produto) {
        System.out.println(nome + " foi notificado: Novo produto disponível - " + produto);
    }
}