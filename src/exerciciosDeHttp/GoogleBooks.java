package exerciciosDeHttp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis sobre o livro retornado pela API.
         */

        //https://www.googleapis.com/books/v1/volumes?q={tituloAqui}&key={minhaChaveAqui}

        //AIzaSyD1TeK4DunS0hAHwuOxlEmAAz_jIOcwy_Y

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o livro que você gostaria de ver a sinopse: ");
        String chave = "AIzaSyD1TeK4DunS0hAHwuOxlEmAAz_jIOcwy_Y";
        String livro = sc.nextLine();
        String endereco = "https://www.googleapis.com/books/v1/volumes?q="+livro.replace(" ","+") + chave;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());





    }
}
