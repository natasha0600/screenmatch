package exercicios;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.ano = 1976;
        carro.cor = "Rosa";

        carro.exibirFichaTecnica();

        System.out.println("Idade do carro: "+carro.calculaIdade());
    }
}
