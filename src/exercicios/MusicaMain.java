package exercicios;

public class MusicaMain {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.artista = "Natasha";
        musica.tituloMusica = "ABC";
        musica.anoLancamento = 2025;
        musica.exibirFichaTecnica();

        musica.avaliarMusica(3);
        musica.avaliarMusica(8);
        musica.avaliarMusica(5);

        double mediaAvaliacoes = musica.calculaMediaAvaliacoes();
        System.out.println("Média das avaliações: "+mediaAvaliacoes);
    }
}
