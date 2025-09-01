package exerciciosDeException;

import java.util.Scanner;

public class NumerosMain {
    /*Crie um programa simples que solicita dois números ao
    usuário e realiza a divisão do primeiro pelo segundo.
    Utilize o bloco try/catch para tratar a exceção que pode ocorrer
    caso o usuário informe 0 como divisor.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = sc.nextInt();

        try {
            int resultadoDivisao = num1/num2;
            System.out.println("Resultado da divisão: "+resultadoDivisao);
        }catch (ArithmeticException e){
            System.out.println("Erro, divisão por zero não pode!");
        }

    }
}
