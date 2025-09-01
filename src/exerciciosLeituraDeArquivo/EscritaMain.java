package exerciciosLeituraDeArquivo;

import java.io.FileWriter;
import java.io.IOException;

public class EscritaMain {
    public static void main(String[] args) throws IOException {
        /*
        Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
         */
        FileWriter escrita = new FileWriter("arquivo.txt");
        String texto = "Olá, meu nome é Natasha";
        escrita.write(texto);
        escrita.close();

    }
}
