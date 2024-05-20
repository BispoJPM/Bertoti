package bertoti;

public class SpotifyTest {

    public static void main(String[] args) {
        testUsuario();
        testMusica();
        testPlaylist();
        testSpotify();
    }

    public static void testUsuario() {
        // Teste para verificar as funcionalidades da classe Usuario
        Spotify spotify = new Spotify();
        Usuario usuario = new Usuario("Joao", "senha123");
    
        // Adiciona uma playlist através do Spotify
        Playlist playlist = new Playlist("GoodVibes");
        spotify.adicionarPlaylist(playlist);
    
        // Adiciona o usuário ao Spotify
        spotify.adicionarUsuario(usuario);
    
        // Verifica se a playlist está associada ao usuário
        assert usuario.getPlaylists().contains(playlist);
    
        System.out.println("Teste de Usuario: SUCESSO");
    }
    
    public static void testMusica() {
        // Teste para verificar as funcionalidades da classe Musica
        Musica musica = new Musica("Céu Azul", "Charlie Brown Jr", "MPC", 180, "ROCK");
        
        // Verifica se os getters retornam os valores corretos
        assert musica.getTitulo().equals("Céu Azul");
        assert musica.getArtista().equals("Charlie Bronw Jr");
        assert musica.getAlbum().equals("MPC");
        assert musica.getDuracao() == 180;
        assert musica.getGenero().equals("ROCK");
        
        System.out.println("Teste de Musica: SUCESSO");
    }

    public static void testPlaylist() {
        // Teste para verificar as funcionalidades da classe Playlist
        Playlist playlist = new Playlist("GoodVibes");
        Musica musica = new Musica("Dois Rios", "Skank", "MPC", 180, "MPB");
        
        // Adiciona uma música e verifica se foi adicionada corretamente
        playlist.adicionarMusica(musica);
        assert playlist.getMusicas().contains(musica);
        
        // Remove a música e verifica se foi removida corretamente
        playlist.removerMusica(musica);
        assert !playlist.getMusicas().contains(musica);
        
        // Testa o método de busca de música na playlist
        playlist.adicionarMusica(musica);
        assert playlist.buscarMusica("Titulo").contains(musica);
        
        System.out.println("Teste de Playlist: SUCESSO");
    }

    public static void testSpotify() {
        // Teste para verificar as funcionalidades da classe Spotify
        Spotify spotify = new Spotify();
        Usuario usuario = new Usuario("Joao", "senha123");
        Musica musica = new Musica("Céu Azul", "Chorao", "MPC", 180, "Rock");
        Playlist playlist = new Playlist("Minha Playlist");
        
        // Adiciona um usuário, uma música e uma playlist
        spotify.adicionarUsuario(usuario);
        spotify.adicionarMusica(musica);
        spotify.adicionarPlaylist(playlist);
        
        // Verifica se as listas de usuários, músicas e playlists contêm os elementos adicionados
        assert spotify.getUsuarios().contains(usuario);
        assert spotify.getMusicas().contains(musica);
        assert spotify.getPlaylists().contains(playlist);
        
        // Testa a busca de música no Spotify
        assert spotify.buscarMusica("Titulo").contains(musica);
        
        System.out.println("Teste de Spotify: SUCESSO");
    }
}
