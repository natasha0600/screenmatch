package exercicios2;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void denifirModelo (String modelo){
        this.modelo = modelo;
    }

    public void precoAnos(int precoAno1, int precoAno2, int precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;

    }

    public double calcularMenorPreco(){
        double menorPreco = precoAno1;
        if(precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }
        if(precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }
    public void exibirInfo(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Preço Ano 1 R$ "+precoAno1);
        System.out.println("Preço Ano 2 R$ "+precoAno2);
        System.out.println("Preço Ano 3 R$ "+precoAno3);
        System.out.println("Menor preço "+calcularMenorPreco());

    }


}
