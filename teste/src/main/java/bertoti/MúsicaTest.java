package bertoti;

public class MúsicaTest {

    public static void main(String[] args) {
        testGetGenero();
        testGetTempo();
        testIsSucesso();
    }

    public static void testGetGenero() {
        Música música = new Música("Rock", 4.5, true);
        String genero = música.getGenero();
        System.out.println("Teste testGetGenero: " + (genero.equals("Rock") ? "Passou" : "Falhou"));
    }

    public static void testGetTempo() {
        Música música = new Música("Pop", 3.2, false);
        double tempo = música.getTempo();
        System.out.println("Teste testGetTempo: " + (tempo == 3.2 ? "Passou" : "Falhou"));
    }

    public static void testIsSucesso() {
        Música música = new Música("Hip-Hop", 5.0, true);
        boolean sucesso = música.isSucesso();
        System.out.println("Teste testIsSucesso: " + (sucesso ? "Passou" : "Falhou"));
    }
}
