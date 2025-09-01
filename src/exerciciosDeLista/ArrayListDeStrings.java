package exerciciosDeLista;

import java.util.ArrayList;

public class ArrayListDeStrings {
    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("N");
        lista.add("Z");
        lista.add("G");

        for(String percorre: lista){
            System.out.println(percorre);
        }
    }
}
