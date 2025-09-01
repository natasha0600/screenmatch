package exerciciosDeGsoneJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class PessoaPrincipal {
    public static void main(String[] args) throws IOException {
       String jsonPessoa = "{\"nome\":\"Natasha\",\"idade\":25,\"cidade\":\"São Leopoldo\"}";
       Gson gson = new Gson();
       Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Objeto Pessoa: "+pessoa);

        //convertendo de jsonPessoa para Pessoa
        Gson gson2 = new GsonBuilder().setLenient().create();
        Pessoa pessoa2 = gson2.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Objeto pessoa 2: "+pessoa2);
    }
}
