package exerciciosDeException;

public class CapturaErroArray {
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};

        int indiceInvalido = -1;
        System.out.println("Tentando acessar o indice "+indiceInvalido+" do array");

        try{
            int valor = numeros[indiceInvalido];
            System.out.println("O valor no indice "+indiceInvalido+" é "+valor);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("O indice que você tentou acessar não existe");
        }
        System.out.println("Programa finalizado");
    }

}
