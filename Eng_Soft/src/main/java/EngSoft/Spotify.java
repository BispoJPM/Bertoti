package EngSoft;

import java.util.ArrayList;
import java.util.List;

public class Spotify {
    private List<Usuario> usuarios;
    private List<Musica> musicas;
    private List<Playlist> playlists;

    public Spotify() {
        this.usuarios = new ArrayList<>();
        this.musicas = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Musica> buscarMusica(String titulo) {
        List<Musica> resultado = new ArrayList<>();
        for (Musica musica : musicas) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                resultado.add(musica);
            }
        }
        return resultado;
    }
}
