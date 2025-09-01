package exerciciosDeLista;

import java.util.ArrayList;

public class VerificaNumerosMain {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(5);
        numeros.add(40);
        numeros.add(15);

        // 1. Verifique se o número 25 está na lista e imprima uma mensagem informando.
        //    Dica: Use .contains(elemento).
        if(numeros.contains(25)){
            System.out.println("Numero existe na lista");
        }
        else{
            System.out.println("Numero não existe na lista");
        }


        // 2. Verifique se o número 99 está na lista e imprima uma mensagem.

        if(numeros.contains(99)){
            System.out.println("Numero existe na lista");
        }
        else{
            System.out.println("Numero não existe na lista");
        }

        // 3. Percorra a lista e imprima cada número em uma nova linha.
       for(Integer num : numeros){
            System.out.println(num);
        }
       //ou:
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

    }
}
