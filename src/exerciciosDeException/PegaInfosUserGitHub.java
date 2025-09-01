package exerciciosDeException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PegaInfosUserGitHub {
    /*Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
    link api github: https://api.github.com/users/{colocar o nome do usuario}
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do usuário que deseja buscar");
        String busca = leitura.nextLine();

        String endereco = "https://api.github.com/users/"+busca;
        System.out.println(endereco);

        try{

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrato no GitHub");
            }

            String json = response.body();
            System.out.println(json);

        }catch (IOException | InterruptedException e){
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }


    }

}
