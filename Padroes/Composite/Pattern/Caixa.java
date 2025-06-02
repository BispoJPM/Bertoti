package Pattern;

import java.util.*;

class Caixa implements Itens {
    private List<Itens> itens = new ArrayList<>();

    public void adicionar(Itens item) {
        itens.add(item);
    }

    public void exibir() {
        for (Itens item : itens) {
            item.exibir();
        }
    }
}