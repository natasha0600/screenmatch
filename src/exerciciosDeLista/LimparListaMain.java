package exerciciosDeLista;

import java.util.ArrayList;

public class LimparListaMain {
    public static void main(String[] args) {
        ArrayList <String> itensCarrinho = new ArrayList<>();
        itensCarrinho.add("Ovos");
        itensCarrinho.add("Leite");
        itensCarrinho.add("Pães");



        // 1. Verifique se o carrinho está vazio e imprima uma mensagem.
        if(itensCarrinho.isEmpty()){
            System.out.println("Carrinho está vazio!");
        }
        else{
            System.out.println("Itens do carrinho: "+itensCarrinho);
        }

        // 2. Limpe todos os itens do carrinho.
        itensCarrinho.clear();

        // 3. Verifique novamente se o carrinho está vazio e imprima uma mensagem.
        if(itensCarrinho.isEmpty()){
            System.out.println("Carrinho está vazio!");
        }




    }
}
