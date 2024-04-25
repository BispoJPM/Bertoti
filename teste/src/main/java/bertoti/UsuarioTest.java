package bertoti;

public class UsuarioTest {

    public static void main(String[] args) {
        testarGetGosto();
        testarGetTempo();
        testarIsAssinante();
    }

    public static void testarGetGosto() {
        // Cria uma instância de Usuario para teste
        Usuario usuario = new Usuario("Rock", 5, true);

        // Testa o método getGosto()
        if (usuario.getGosto().equals("Rock")) {
            System.out.println("\n" + "Teste Gosto: PASSOU");
        } else {
            System.out.println("\n" + "Teste Gosto: FALHOU");
        }
    }

    public static void testarGetTempo() {
        // Cria uma instância de Usuario para teste
        Usuario usuario = new Usuario("Rock", 5, true);

        // Testa o método getTempo()
        if (usuario.getTempo() == 5.5) {
            System.out.println("Teste getTempo: PASSOU");
        } else {
            System.out.println("Teste getTempo: FALHOU");
        }
    }

    public static void testarIsAssinante() {
        // Cria uma instância de Usuario para teste
        Usuario usuario = new Usuario("Rock", 5, true);

        // Testa o método isAssinante()
        if (usuario.isAssinante()) {
            System.out.println("Teste Assinante: PASSOU" + "\n");
        } else {
            System.out.println("Teste Assinante: FALHOU" + "\n");
        }
    }
}

