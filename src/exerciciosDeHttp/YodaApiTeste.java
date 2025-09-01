package exerciciosDeHttp;

import javax.xml.transform.Source;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class YodaApiTeste {
    public static void main(String[] args) throws IOException, InterruptedException {
        String endereco = "https://api.funtranslations.com/translate/yoda.json";
        Scanner sc = new Scanner(System.in);
        String textoParaTraduzir = sc.nextLine();
        /*
        URLEncoder.encode: Incluí o URLEncoder.encode para o textoParaTraduzir. Isso é importante porque caracteres como espaços, pontuações e outros símbolos precisam ser "escapados" corretamente para serem enviados em uma URL ou em um corpo x-www-form-urlencoded. Se não fizer isso, a requisição pode ser mal interpretada pelo servidor.
         */
        String encodedText = URLEncoder.encode(textoParaTraduzir, StandardCharsets.UTF_8);
        String requestBody = "text="+encodedText;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco)).header("Content-Type", "application/x-www-form-urlencoded").POST(HttpRequest.BodyPublishers.ofString(requestBody)).build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Dados da repsosta traduzida: ");
        System.out.println(response.body());

    }
}
