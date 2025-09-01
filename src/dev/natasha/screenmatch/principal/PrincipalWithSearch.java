package dev.natasha.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.natasha.screenmatch.exception.YearConversionErrorException;
import dev.natasha.screenmatch.models.OmdbTitle;
import dev.natasha.screenmatch.models.Title;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reading = new Scanner(System.in);
        String searching = "";
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()//arruma o arquivo em JSON para ficar de uma forma mais bonita de se ler
                .create();

        while (!searching.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");
            searching = reading.nextLine();

            if(searching.equalsIgnoreCase("sair")){
                break;
            }

            String address = "http://www.omdbapi.com/?t=" + searching.replace(" ", "+") + "&apikey=3b4a3e20";
            System.out.println(address);
            try {
                //fazendo a conexão entre cliente e servidor
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();
                //preciso da minha resposta, do HTTP response:
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);//estou imprimindo o corpo da resposta aqui pois é o que tem no corpo do JSON

                //agora irei utilizar o Gson para transformar as infos dos filmes que estão em formato JSON para o formato que eu quero

                OmdbTitle myOmdbTitle = gson.fromJson(json, OmdbTitle.class);
                System.out.println(myOmdbTitle);

                Title myTitle = new Title(myOmdbTitle);
                System.out.println("titulo ja convertido");
                System.out.println(myTitle);

                titles.add(myTitle);
            } catch (NumberFormatException error) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(error.getMessage());
            } catch (IllegalArgumentException error) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (YearConversionErrorException error) {
                System.out.println(error.getMessage());
            }
        }
        System.out.println(titles);
        FileWriter writing = new FileWriter("filmes.json");
        writing.write(gson.toJson(titles));
        writing.close();
        System.out.println("Programa finalizou corretamente!");



    }
}
