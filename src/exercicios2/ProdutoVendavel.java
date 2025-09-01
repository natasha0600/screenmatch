package exercicios2;

public class ProdutoVendavel implements Vendavel{
    private String nome;
    private double precoUnitario;

    @Override
    public double calculaPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}
