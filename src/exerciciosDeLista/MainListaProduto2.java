package exerciciosDeLista;

import java.util.ArrayList;

public class MainListaProduto2 {
    public static void main(String[] args) {
        ArrayList <Produto2> lista = new ArrayList<>();
        lista.add(new Produto2("detergente",2.99));
        lista.add(new Produto2("sabão",10.50));

        double somaPrecos = 0;
        for (Produto2 produto : lista){
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / lista.size();
        System.out.println("Preço médio dos produtos: "+precoMedio);
    }
}
