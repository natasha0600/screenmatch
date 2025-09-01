package exercicios;

public class Musica {
    String artista;
    String tituloMusica;
    int anoLancamento;
    int totalAvaliacoes;
    int somaAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Titulo da musica: "+tituloMusica);
        System.out.println("Nome do artista: "+artista);
        System.out.println("Ano de lançamento da música: "+anoLancamento);
    }

    void avaliarMusica(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }
    double calculaMediaAvaliacoes(){

        return somaAvaliacoes/totalAvaliacoes;
    }
}
