package EngSoft;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
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

    public List<Musica> getMusicas() {
        return musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

