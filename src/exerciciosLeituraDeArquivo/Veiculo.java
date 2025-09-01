package exerciciosLeituraDeArquivo;

public class Veiculo {
    private String modelo;
    private String marca;
    private String cor;

    public Veiculo(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }
}
