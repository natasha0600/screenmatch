package exerciciosLeituraDeArquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VeiculoMain {
    public static void main(String[] args) throws IOException {
        List <Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Veiculo("Fusca","Volkswagem","amarela"));
        veiculos.add(new Veiculo("Fiat 147","Fiat","vermelha"));
        veiculos.add(new Veiculo("Fusca","Volksvagem","branca"));
        veiculos.add(new Veiculo("Gol Quadrado","Volksvagem","preta"));

        FileWriter escrita = new FileWriter("veiculos.json");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        escrita.write(gson.toJson(veiculos));
        escrita.close();
    }
}
