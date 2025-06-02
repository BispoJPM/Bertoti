package Pattern;

class DescontoNatalino implements Desconto {
    public double calcular(double preco) {
        return preco * 0.9;
    }
}