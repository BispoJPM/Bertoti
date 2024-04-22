package bertoti;

public class Música {
    private String genero;
    private double tempo;
    private boolean sucesso;

    // Construtor
    public Música(String genero, double tempo, boolean sucesso) {
        this.genero = genero;
        this.tempo = tempo;
        this.sucesso = sucesso;
    }

    // Getters
    public String getGenero() {
        return genero;
    }

    public double getTempo() {
        return tempo;
    }

    public boolean isSucesso() {
        return sucesso;
    }
}

