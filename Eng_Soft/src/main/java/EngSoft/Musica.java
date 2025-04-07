package EngSoft;

public class Musica {
    private String titulo;
    private String artista;
    private String album;
    private int duracao;
    private String genero;

    // Construtor da classe Musica
    public Musica(String titulo, String artista, String album, int duracao, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
        this.genero = genero;
    }

    // Método para obter informações da música
    public String obterInformacoes() {
        return "Título: " + titulo + ", Artista: " + artista + ", Álbum: " + album + ", Duração: " + duracao + "s, Gênero: " + genero;
    }

    // Getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
