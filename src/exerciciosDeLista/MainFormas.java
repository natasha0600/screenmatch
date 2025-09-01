package exerciciosDeLista;

import java.util.ArrayList;

public class MainFormas {
    public static void main(String[] args) {
        ArrayList <Forma> listaFormas = new ArrayList<>();
        listaFormas.add(new Circulo(2));
        listaFormas.add(new Quadrado(8));


        for(Forma formas : listaFormas){
            System.out.println("Area: "+formas.calcularArea());
        }
    }
}
