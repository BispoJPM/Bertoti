classDiagram
    class Produtos {
        - String nome
        + Produtos(nome)
        + void exibir()
    }

    class Caixas {
        - Produtos produto1
        - Produtos produto2
        + Caixas(p1: Produtos, p2: Produtos)
        + void exibir()
    }

    class Componente {
        + main(args: String[])
    }

    Caixas "1" --> "1" Produtos : produto1
    Caixas "1" --> "1" Produtos : produto2
    Componente ..> Produtos : cria instancia
    Componente ..> Caixas : cria instancia
