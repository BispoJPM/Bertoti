package bertoti;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

private String nome;
    private String senha;
    private List<Playlist> playlists;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.playlists = new ArrayList<>();
    }

    public Playlist criarPlaylist(String nome) {
        Playlist playlist = new Playlist(nome, this);
        playlists.add(playlist);
        return playlist;
    }

    public void removerPlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    public void adicionarMusicaPlaylist(Playlist playlist, Musica musica) {
        playlist.adicionarMusica(musica);
    }

    public void removerMusicaPlaylist(Playlist playlist, Musica musica) {
        playlist.removerMusica(musica);
    }

    public List<Musica> buscarMusica(String nome) {
        List<Musica> result = new ArrayList<>();
        for (Playlist playlist : playlists) {
            result.addAll(playlist.buscarMusica(nome));
        }
        return result;
    }

    // Getters and setters if necessary

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return List<Playlist> return the playlists
     */
    public List<Playlist> getPlaylists() {
        return playlists;
    }

    /**
     * @param playlists the playlists to set
     */
    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

}
