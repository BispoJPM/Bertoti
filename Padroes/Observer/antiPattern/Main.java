public class Main {
    public static void main(String[] args) {
        Bateria celular = new Bateria();
        celular.porcentagem();
    }
}

class Bateria {
    private int nivel = 80;

    public void porcentagem() {
        System.out.println("Bateria em: " + nivel + "%");
    }
}