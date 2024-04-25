package bertoti;

public class Testes {

    public static void main(String[] args) {
        testarSpotify();
        testarUsuario();
        testarPlaylist();
        testarMusica();
    }

    public static void testarSpotify() {
        // Cria uma instância de Spotify para teste
        Spotify spotify = new Spotify("Imagine", 123, 1);

        // Testa o método getMusica()
        if (spotify.getMusica().equals("Imagine")) {
            System.out.println("\n" + "Teste Musica: PASSOU");
        } else {
            System.out.println("\n" + "Teste Musica: FALHOU");
        }

        // Testa o método getUsuario()
        if (spotify.getUsuario() == 123) {
            System.out.println("Teste Usuario: PASSOU");
        } else {
            System.out.println("Teste Usuario: FALHOU");
        }

        // Testa o método getPlaylist()
        if (spotify.getPlaylist() == 1) {
            System.out.println("Teste Playlist: PASSOU");
        } else {
            System.out.println("Teste Playlist: FALHOU");
        }
    }

    public static void testarUsuario() {
        // Cria uma instância de Usuario para teste
        Usuario usuario = new Usuario("Rock", 5, true);

        // Testa o método getGosto()
        if (usuario.getGosto().equals("Rock")) {
            System.out.println("\n" + "Teste Gosto: PASSOU");
        } else {
            System.out.println("\n" + "Teste Gosto): FALHOU");
        }

        // Testa o método getTempo()
        if (usuario.getTempo() == 5.5) {
            System.out.println("Teste Tempo: PASSOU");
        } else {
            System.out.println("Teste getTempo: FALHOU");
        }

        // Testa o método isAssinante()
        if (usuario.isAssinante()) {
            System.out.println("Teste Assinante: PASSOU");
        } else {
            System.out.println("Teste Assinante: FALHOU");
        }
    }

    public static void testarPlaylist() {
        // Cria uma instância de Playlist para teste
        Playlist playlist = new Playlist(10, 1000, "Artista X");

        // Testa o método getMusica()
        if (playlist.getMusica() == 10) {
            System.out.println("\n" + "Teste Musica: PASSOU");
        } else {
            System.out.println("\n" + "Teste Musica: FALHOU");
        }

        // Testa o método getCurtidas()
        if (playlist.getCurtidas() == 1000) {
            System.out.println("Teste Curtidas: PASSOU");
        } else {
            System.out.println("Teste Curtidas: FALHOU");
        }

        // Testa o método getartista()
        if (playlist.getartista().equals("Artista X")) {
            System.out.println("Teste artista: PASSOU");
        } else {
            System.out.println("Teste artista: FALHOU");
        }
    }

    public static void testarMusica() {
        // Cria uma instância de Música para teste
        Música música = new Música("Pop", 3, false);

        // Testa o método getGenero()
        if (música.getGenero().equals("Pop")) {
            System.out.println("\n" + "Teste Genero: PASSOU");
        } else {
            System.out.println("\n" + "Teste Genero: FALHOU");
        }

        // Testa o método getTempo()
        if (música.getTempo() == 3.2) {
            System.out.println("Teste Tempo: PASSOU");
        } else {
            System.out.println("Teste Tempo: FALHOU");
        }

        // Testa o método isSucesso()
        if (!música.isSucesso()) {
            System.out.println("Teste Sucesso: PASSOU" + "\n");
        } else {
            System.out.println("Teste Sucesso: FALHOU" + "\n");
        }
    }
}

