classDiagram
    class Desconto {
        <<interface>>
        + calcular(preco: double) double
    }

    class ClienteFiel {
        + calcular(preco: double) double
    }

    class DescontoNatalino {
        + calcular(preco: double) double
    }

    class Produto {
        - String nome
        - double preco
        - Desconto desconto
        + Produto(nome: String, preco: double, desconto: Desconto)
        + precoFinal() double
    }

    class Strategy {
        + main(args: String[])
    }

    ClienteFiel ..|> Desconto
    DescontoNatalino ..|> Desconto
    Produto --> Desconto : desconto
    Strategy ..> Produto
    Strategy ..> ClienteFiel
    Strategy ..> DescontoNatalino
