package bertoti;

public class Playlist {
    private int musica;
    private int curtidas;
    private String artista;

    // Construtor
    public Playlist(int musica, int curtidas, String artista) {
        this.musica = musica;
        this.curtidas = curtidas;
        this.artista = artista;
    }

    // Métodos getters
    public int getMusica() {
        return musica;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getartista() {
        return artista;
    }
}

