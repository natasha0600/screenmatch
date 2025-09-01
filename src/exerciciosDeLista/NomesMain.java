package exerciciosDeLista;

import java.util.ArrayList;
import java.util.Collections;

public class NomesMain {
    public static void main(String[] args) {
        ArrayList <String> nomes= new ArrayList<>();
        nomes.add("Natasha");
        nomes.add("Lawrence");
        nomes.add("Geisi");
        System.out.println(nomes.size());
        Collections.sort(nomes);
        System.out.println(nomes);
    }
}
