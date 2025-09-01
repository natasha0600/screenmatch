package exerciciosDeLista;

import java.util.ArrayList;

public class ProdutoMain {
    public static void main(String[] args) {
        ArrayList <Produto> lista = new ArrayList<>();
        lista.add(new Produto("Feijão", 2.99, 80));
        lista.add(new Produto("Arroz",19.90,100));
        lista.add(new Produto("Massa",2.99,90));
        lista.add(new ProdutoPerecivel("Carne bovina",39.90,60,"06/06/2026"));
        System.out.println(lista.size());
        System.out.println(lista.get(3));
        System.out.println(lista);

    }

}
