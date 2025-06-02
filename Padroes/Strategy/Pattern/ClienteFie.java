package Pattern;

class ClienteFie implements Desconto {
    public double calcular(double preco) {
        return preco * 0.85;
    }
}