```mermaid
classDiagram
    class Itens {
        <<interface>>
        +exibir()
    }

    class Produtos {
        -nome: String
        +Produtos(nome: String)
        +exibir()
    }

    class Caixa {
        -itens: List<Itens>
        +adicionar(item: Itens)
        +exibir()
    }

    class Componente {
        +main(args: String[])
    }

    Itens <|.. Produtos
    Itens <|.. Caixa
    Componente --> Produtos
    Componente --> Caixa
    Caixa --> Itens
