package exerciciosDeException;

import java.util.Scanner;

public class MultiplosBlocosCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {100,200,300,400,500};
        System.out.println("Este array tem "+array.length+" elementos (indices de 0 a "+(array.length-1)+")");
        System.out.println("Por favor, digite um número inteiro que será usado como indice");

        try{
            String entradaUsuario = scanner.nextLine();
            int indice = Integer.parseInt(entradaUsuario);
            int valor = array[indice];

            System.out.println("Sucesso! O valor no indice "+indice+" é "+valor);
        }catch (NumberFormatException n){
            System.out.println("Você não digitou um número válido");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("O número que você digitou está fora dos limites válidos do array");
        }
        System.out.println("Programa finalizado com sucesso!");


    }

}
