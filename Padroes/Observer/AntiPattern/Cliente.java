package Padroes.Observer.AntiPattern;

class Cliente {
    public void receberNotificacao(String produto) {
        System.out.println("Notificado sobre " + produto);
    }
}