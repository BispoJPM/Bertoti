package bertoti;

import java.util.ArrayList;
import java.util.List;

public class Spotify {
    private List<Usuario> usuarios;
    private List<Playlist> playlists;
    private List<Musica> musicas;

    public Spotify() {
        this.usuarios = new ArrayList<>();
        this.playlists = new ArrayList<>();
        this.musicas = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removerPlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    public List<Musica> buscarMusica(String titulo) {
        List<Musica> result = new ArrayList<>();
        for (Musica musica : musicas) {
            if (musica.obterInformacoes().contains(titulo)) {
                result.add(musica);
            }
        }
        return result;
    }

    // Getters and setters if necessary

    /**
     * @return List<Usuario> return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
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

    /**
     * @return List<Musica> return the musicas
     */
    public List<Musica> getMusicas() {
        return musicas;
    }

    /**
     * @param musicas the musicas to set
     */
    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

}
