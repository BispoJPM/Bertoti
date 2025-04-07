package Composite.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Compenente {
    private String nome;
    private List<Compenente> crianca = new ArrayList<>();

    public Folder(String nome) {
        this.nome = nome;
    }

    public void add(Compenente component) {
        crianca.add(component);
    }

    public void Detalhes() {
        System.out.println("Pasta: " + nome);
        for (Compenente c : crianca) {
            c.Detalhes();
        }
    }
}