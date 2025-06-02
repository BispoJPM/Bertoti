classDiagram
    class Produto {
        - String nome
        - double preco
        - String tipoDesconto
        + Produto(nome: String, preco: double, tipoDesconto: String)
        + double precoFinal()
    }

    class Strategy {
        + main(args: String[])
    }

    Strategy ..> Produto : cria instancia
