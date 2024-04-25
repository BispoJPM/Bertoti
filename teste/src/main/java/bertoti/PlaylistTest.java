package bertoti;

public class PlaylistTest {

    public static void main(String[] args) {
        testarGetMusica();
        testarGetCurtidas();
        testarGetartista();
    }

    public static void testarGetMusica() {
        // Cria uma instância de Playlist para teste
        Playlist playlist = new Playlist(9, 10, "Artista Taylor");

        // Testa o método getMusica()
        if (playlist.getMusica() == 10) {
            System.out.println("\n" + "Teste Musica: PASSOU");
        } else {
            System.out.println("\n" + "Teste Musica: FALHOU");
        }
    }

    public static void testarGetCurtidas() {
        // Cria uma instância de Playlist para teste
        Playlist playlist = new Playlist(10, 1000, "Artista X");

        // Testa o método getCurtidas()
        if (playlist.getCurtidas() == 1000) {
            System.out.println("Teste Curtidas: PASSOU");
        } else {
            System.out.println("Teste Curtidas: FALHOU");
        }
    }

    public static void testarGetartista() {
        // Cria uma instância de Playlist para teste
        Playlist playlist = new Playlist(10, 1000, "Artista X");

        // Testa o método getartista()
        if (playlist.getartista().equals("Artista X")) {
            System.out.println("Teste artista: PASSOU"+ "\n");
        } else {
            System.out.println("Teste artista: FALHOU"+ "\n");
        }
    }
}
