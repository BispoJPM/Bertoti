package bertoti;

public class Spotify {
    private String musica;
    private double usuario;
    private int playlist;

    // Construtor
    public Spotify(String musica, int usuario, int playlist) {
        this.musica = musica;
        this.usuario = usuario;
        this.playlist = playlist;
    }

    // Métodos getters
    public String getMusica() {
        return musica;
    }

    public double getUsuario() {
        return usuario;
    }

    public int getPlaylist() {
        return playlist;
    }
}
