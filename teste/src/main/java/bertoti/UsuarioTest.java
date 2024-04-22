package bertoti;

public class UsuarioTest {

    public static void main(String[] args) {
        testarGetGosto();
        testarGetTempo();
        testarIsAssinante();
    }

    public static void testarGetGosto() {
        // Cria uma instância de Usuario para teste
        Usuario usuario = new Usuario("Rock", 5.5, true);

        // Testa o método getGosto()
        if (usuario.getGosto().equals("Rock")) {
            System.out.println("Teste getGosto() (Usuario): PASSOU");
        } else {
            System.out.println("Teste getGosto() (Usuario): FALHOU");
        }
    }

    public static void testarGetTempo() {
        // Cria uma instância de Usuario para teste
        Usuario usuario = new Usuario("Rock", 5.5, true);

        // Testa o método getTempo()
        if (usuario.getTempo() == 5.5) {
            System.out.println("Teste getTempo() (Usuario): PASSOU");
        } else {
            System.out.println("Teste getTempo() (Usuario): FALHOU");
        }
    }

    public static void testarIsAssinante() {
        // Cria uma instância de Usuario para teste
        Usuario usuario = new Usuario("Rock", 5.5, true);

        // Testa o método isAssinante()
        if (usuario.isAssinante()) {
            System.out.println("Teste isAssinante() (Usuario): PASSOU");
        } else {
            System.out.println("Teste isAssinante() (Usuario): FALHOU");
        }
    }
}

