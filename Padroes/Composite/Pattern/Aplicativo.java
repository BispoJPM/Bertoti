package Composite.Pattern;

public class App implements Compenente {
    private String nome;

    public App(String nome) {
        this.name = nome;
    }

    public void Detalhes() {
        System.out.println("App: " + nome);
    }
}