classDiagram
    class Cliente {
        + void receberNotificacao(produto: String)
    }

    class Mercadinho {
        - Cliente cliente1
        - Cliente cliente2
        + Mercadinho(c1: Cliente, c2: Cliente)
        + void novoProduto(produto: String)
    }

    class Observer {
        + main(args: String[])
    }

    Mercadinho "1" --> "1" Cliente : cliente1
    Mercadinho "1" --> "1" Cliente : cliente2
    Observer ..> Cliente : cria instancia
    Observer ..> Mercadinho : cria instancia
