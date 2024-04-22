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
            System.out.println("Teste getMusica() (Spotify): PASSOU");
        } else {
            System.out.println("Teste getMusica() (Spotify): FALHOU");
        }

        // Testa o método getUsuario()
        if (spotify.getUsuario() == 123) {
            System.out.println("Teste getUsuario() (Spotify): PASSOU");
        } else {
            System.out.println("Teste getUsuario() (Spotify): FALHOU");
        }

        // Testa o método getPlaylist()
        if (spotify.getPlaylist() == 1) {
            System.out.println("Teste getPlaylist() (Spotify): PASSOU");
        } else {
            System.out.println("Teste getPlaylist() (Spotify): FALHOU");
        }
    }

    public static void testarUsuario() {
        // Cria uma instância de Usuario para teste
        Usuario usuario = new Usuario("Rock", 5.5, true);

        // Testa o método getGosto()
        if (usuario.getGosto().equals("Rock")) {
            System.out.println("Teste getGosto() (Usuario): PASSOU");
        } else {
            System.out.println("Teste getGosto() (Usuario): FALHOU");
        }

        // Testa o método getTempo()
        if (usuario.getTempo() == 5.5) {
            System.out.println("Teste getTempo() (Usuario): PASSOU");
        } else {
            System.out.println("Teste getTempo() (Usuario): FALHOU");
        }

        // Testa o método isAssinante()
        if (usuario.isAssinante()) {
            System.out.println("Teste isAssinante() (Usuario): PASSOU");
        } else {
            System.out.println("Teste isAssinante() (Usuario): FALHOU");
        }
    }

    public static void testarPlaylist() {
        // Cria uma instância de Playlist para teste
        Playlist playlist = new Playlist(10, 1000, "Artista X");

        // Testa o método getMusica()
        if (playlist.getMusica() == 10) {
            System.out.println("Teste getMusica() (Playlist): PASSOU");
        } else {
            System.out.println("Teste getMusica() (Playlist): FALHOU");
        }

        // Testa o método getCurtidas()
        if (playlist.getCurtidas() == 1000) {
            System.out.println("Teste getCurtidas() (Playlist): PASSOU");
        } else {
            System.out.println("Teste getCurtidas() (Playlist): FALHOU");
        }

        // Testa o método getCantor()
        if (playlist.getCantor().equals("Artista X")) {
            System.out.println("Teste getCantor() (Playlist): PASSOU");
        } else {
            System.out.println("Teste getCantor() (Playlist): FALHOU");
        }
    }

    public static void testarMusica() {
        // Cria uma instância de Música para teste
        Música música = new Música("Pop", 3.2, false);

        // Testa o método getGenero()
        if (música.getGenero().equals("Pop")) {
            System.out.println("Teste getGenero() (Música): PASSOU");
        } else {
            System.out.println("Teste getGenero() (Música): FALHOU");
        }

        // Testa o método getTempo()
        if (música.getTempo() == 3.2) {
            System.out.println("Teste getTempo() (Música): PASSOU");
        } else {
            System.out.println("Teste getTempo() (Música): FALHOU");
        }

        // Testa o método isSucesso()
        if (!música.isSucesso()) {
            System.out.println("Teste isSucesso() (Música): PASSOU");
        } else {
            System.out.println("Teste isSucesso() (Música): FALHOU");
        }
    }
}

