package exerciciosLeituraDeArquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TituloMain {
    public static void main(String[] args) throws IOException {
        /*
        Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
         */
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Harry Potter e a pedra filosofal","JK Rowling","1998","12345"));
        titulos.add(new Titulo("O senhor dos aneis","Tolkien","1954","5555"));
        titulos.add(new Titulo("Harry Potter e a câmara secreta","JK Rowling","1999","89632"));

        FileWriter escrita = new FileWriter("titulos.json");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        escrita.write(gson.toJson(titulos));
        escrita.close();

        /*
        Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante. Utilize o método setPrettyPrinting para alcançar esse resultado.
            *****FEITO!*****
         */

    }
}
