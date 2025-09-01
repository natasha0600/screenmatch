package exercicios;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo do carro: "+modelo);
        System.out.println("Ano do carro: "+ano);
        System.out.println("Cor do carro: "+cor);
    }

    int calculaIdade(){
        return 2025-ano;
    }

}
