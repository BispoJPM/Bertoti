package Bertoti;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpotifyTest {

    @Test
    public void testUsuario() {
        // Teste para verificar as funcionalidades da classe Usuario
        Spotify spotify = new Spotify();
        Usuario usuario = new Usuario("Joao", "senha123");

        // Adiciona uma playlist através do Spotify
        Playlist playlist = new Playlist("GoodVibes");
        spotify.adicionarPlaylist(playlist);

        // Adiciona o usuário ao Spotify
        spotify.adicionarUsuario(usuario);

        // Associa a playlist ao usuário (supondo que exista um método para isso)
        usuario.adicionarPlaylist(playlist);

        // Verifica se a playlist está associada ao usuário
        assertTrue(usuario.getPlaylists().contains(playlist));
    }

    @Test
    public void testMusica() {
        // Teste para verificar as funcionalidades da classe Musica
        Musica musica = new Musica("Céu Azul", "Charlie Brown Jr", "MPC", 180, "ROCK");

        // Verifica se os getters retornam os valores corretos
        assertEquals("Céu Azul", musica.getTitulo());
        assertEquals("Charlie Brown Jr", musica.getArtista());
        assertEquals("MPC", musica.getAlbum());
        assertEquals(180, musica.getDuracao());
        assertEquals("ROCK", musica.getGenero());
    }

    @Test
    public void testPlaylist() {
        // Teste para verificar as funcionalidades da classe Playlist
        Playlist playlist = new Playlist("GoodVibes");
        Musica musica = new Musica("Dois Rios", "Skank", "MPC", 180, "MPB");

        // Adiciona uma música e verifica se foi adicionada corretamente
        playlist.adicionarMusica(musica);
        assertTrue(playlist.getMusicas().contains(musica));

        // Remove a música e verifica se foi removida corretamente
        playlist.removerMusica(musica);
        assertFalse(playlist.getMusicas().contains(musica));

        // Testa o método de busca de música na playlist
        playlist.adicionarMusica(musica);
        assertTrue(playlist.buscarMusica("Dois Rios").contains(musica));
    }

    @Test
    public void testSpotify() {
        // Teste para verificar as funcionalidades da classe Spotify
        Spotify spotify = new Spotify();
        Usuario usuario = new Usuario("Joao", "senha123");
        Musica musica = new Musica("Céu Azul", "Charlie Brown Jr", "MPC", 180, "ROCK");
        Playlist playlist = new Playlist("Minha Playlist");

        // Adiciona um usuário, uma música e uma playlist
        spotify.adicionarUsuario(usuario);
        spotify.adicionarMusica(musica);
        spotify.adicionarPlaylist(playlist);

        // Verifica se as listas de usuários, músicas e playlists contêm os elementos adicionados
        assertTrue(spotify.getUsuarios().contains(usuario));
        assertTrue(spotify.getMusicas().contains(musica));
        assertTrue(spotify.getPlaylists().contains(playlist));

        // Testa a busca de música no Spotify
        assertTrue(spotify.buscarMusica("Céu Azul").contains(musica));
    }
}
