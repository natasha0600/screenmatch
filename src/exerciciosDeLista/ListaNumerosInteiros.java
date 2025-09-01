package exerciciosDeLista;

import java.util.ArrayList;
import java.util.Collections;

public class ListaNumerosInteiros {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(55);
        listaNumeros.add(3);
        listaNumeros.add(1001);
        listaNumeros.add(385);
        listaNumeros.add(10);
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);
    }
}
