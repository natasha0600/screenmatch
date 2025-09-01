package exercicios2;

public class Servico implements Vendavel{
    private String descricao;
    private double precoHora;
    @Override
    public double calculaPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
