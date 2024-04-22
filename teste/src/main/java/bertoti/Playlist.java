package bertoti;

public class Playlist {
    private int musica;
    private int curtidas;
    private String cantor;

    // Construtor
    public Playlist(int musica, int curtidas, String cantor) {
        this.musica = musica;
        this.curtidas = curtidas;
        this.cantor = cantor;
    }

    // Métodos getters
    public int getMusica() {
        return musica;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getCantor() {
        return cantor;
    }
}

