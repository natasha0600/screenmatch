package exerciciosDeLista;

import java.util.ArrayList;
import java.util.Collections;

public class TItuloMain {
    public static void main(String[] args) {

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(new Titulo("B"));
        lista.add(new Titulo("A"));
        lista.add(new Titulo("N"));
        lista.add(new Titulo("K"));
        Collections.sort(lista);
        System.out.println(lista);





    }
}
