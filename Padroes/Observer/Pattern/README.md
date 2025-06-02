classDiagram
    class Observers {
        <<interface>>
        + atualizar(produto: String)
    }

    class Clientes {
        - String nome
        + Clientes(nome: String)
        + void atualizar(produto: String)
    }

    class Mercadinho {
        - List~Observers~ clientes
        + adicionarCliente(cliente: Observers)
        + novoProduto(produto: String)
    }

    class Observador {
        + main(args: String[])
    }

    Clientes ..|> Observers : implementa
    Mercadinho "1" *-- "*" Observers : clientes
    Observador ..> Mercadinho : cria instancia
    Observador ..> Clientes : cria instancia
