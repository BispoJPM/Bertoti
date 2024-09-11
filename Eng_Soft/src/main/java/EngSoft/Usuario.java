package Bertoti;

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

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
