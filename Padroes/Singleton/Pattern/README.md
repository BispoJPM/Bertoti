classDiagram
    class Estoques {
        - static Estoques instancia
        - Estoques()
        + static getInstancia() Estoques
        + exibirMensagem()
    }

    class Singleton {
        + main(args: String[])
    }

    Singleton ..> Estoques : usa
