package bertoti;

public class MúsicaTest {

    public static void main(String[] args) {
        testGetGenero();
        testGetTempo();
        testIsSucesso();
    }

    public static void testGetGenero() {
        Música música = new Música("Rock", 4, true);
        String genero = música.getGenero();
        System.out.println("\n" + "Teste Genero: " + (genero.equals("Rock") ? "Passou" : "Falhou"));
    }

    public static void testGetTempo() {
        Música música = new Música("Pop", 3, false);
        double tempo = música.getTempo();
        System.out.println("Teste Tempo: " + (tempo == 3.2 ? "Passou" : "Falhou"));
    }

    public static void testIsSucesso() {
        Música música = new Música("Hip-Hop", 5, true);
        boolean sucesso = música.isSucesso();
        System.out.println("Teste Sucesso: " + (sucesso ? "Passou" : "Falhou")+ "\n");
    }
}
