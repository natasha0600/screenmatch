package exercicios2;

public class TesteAnimais {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
    }
}
