package bertoti;

public class Usuario {
    private String gosto;
    private double tempo;
    private boolean assinante;

    // Construtor
    public Usuario(String gosto, int tempo, boolean assinante) {
        this.gosto = gosto;
        this.tempo = tempo;
        this.assinante = assinante;
    }

    // Métodos getters
    public String getGosto() {
        return gosto;
    }

    public double getTempo() {
        return tempo;
    }

    public boolean isAssinante() {
        return assinante;
    }
}

