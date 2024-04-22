package bertoti;

public class PlaylistTest {

    public static void main(String[] args) {
        testarGetMusica();
        testarGetCurtidas();
        testarGetCantor();
    }

    public static void testarGetMusica() {
        // Cria uma instância de Playlist para teste
        Playlist playlist = new Playlist(10, 1000, "Artista X");

        // Testa o método getMusica()
        if (playlist.getMusica() == 10) {
            System.out.println("Teste getMusica() (Playlist): PASSOU");
        } else {
            System.out.println("Teste getMusica() (Playlist): FALHOU");
        }
    }

    public static void testarGetCurtidas() {
        // Cria uma instância de Playlist para teste
        Playlist playlist = new Playlist(10, 1000, "Artista X");

        // Testa o método getCurtidas()
        if (playlist.getCurtidas() == 1000) {
            System.out.println("Teste getCurtidas() (Playlist): PASSOU");
        } else {
            System.out.println("Teste getCurtidas() (Playlist): FALHOU");
        }
    }

    public static void testarGetCantor() {
        // Cria uma instância de Playlist para teste
        Playlist playlist = new Playlist(10, 1000, "Artista X");

        // Testa o método getCantor()
        if (playlist.getCantor().equals("Artista X")) {
            System.out.println("Teste getCantor() (Playlist): PASSOU");
        } else {
            System.out.println("Teste getCantor() (Playlist): FALHOU");
        }
    }
}
