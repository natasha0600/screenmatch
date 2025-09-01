package exerciciosDeLista;

public class Quadrado implements Forma{
    private double tamanhoLados;

    public Quadrado(double tamanhoLados) {
        this.tamanhoLados = tamanhoLados;
    }

    @Override
    public double calcularArea() {
        return tamanhoLados*tamanhoLados;
    }


}
