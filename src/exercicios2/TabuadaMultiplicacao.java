package exercicios2;

import java.util.Scanner;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(double numero) {
        System.out.println("Tabuada de multiplicação do "+numero);
        for(int i = 1; i<= 10; i++){
            double resultado = numero * i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
    }
}
