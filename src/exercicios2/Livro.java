package exercicios2;

public class Livro extends Produto implements Calculavel{
    private String autor;
    @Override
    public double calcularPrecoFinal() {
        double preco = 0;
        return preco * 0.9;
    }


}
