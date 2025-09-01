package exerciciosDeLista;

import java.util.ArrayList;

public class PessoaPrincipal {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Natasha",25);
        Pessoa pessoa2 = new Pessoa("Stefany",21);
        Pessoa pessoa3 = new Pessoa("Amanda",24);
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);
        System.out.println(lista.size());
        System.out.println(lista.get(0));

        for(Pessoa pessoa: lista){
            System.out.println(pessoa);
        }
        //ou
        System.out.println(lista);

    }
}
