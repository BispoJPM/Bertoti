package bertoti;

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

    public List<Musica> listarMusicas() {
        return new ArrayList<>(musicas);
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

    /**
     * @return Usuario return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
