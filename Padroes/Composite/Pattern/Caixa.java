package Padroes.Composite.Pattern;

import java.util.*;

class Caixa implements Item {
    private List<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
    }

    public void exibir() {
        for (Item item : itens) {
            item.exibir();
        }
    }
}