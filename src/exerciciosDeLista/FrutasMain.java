package exerciciosDeLista;

import java.util.ArrayList;

public class FrutasMain {
    public static void main(String[] args) {
        ArrayList <String> frutas = new ArrayList<>();
        frutas.add("Uva");
        frutas.add("Maçã");
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Morango");
        frutas.add("Kiwi");

        // 1. Acesse e imprima a primeira fruta da lista.
        System.out.println(frutas.get(0));

        // 2. Acesse e imprima a terceira fruta da lista.
        System.out.println(frutas.get(2));

        // 3. Tente acessar e imprimir a última fruta da lista sem saber o tamanho exato.
        System.out.println(frutas.getLast());
        //ou
        System.out.println(frutas.size());
        System.out.println(frutas.get(5));

    }
}
