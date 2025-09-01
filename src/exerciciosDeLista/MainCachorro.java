package exerciciosDeLista;

public class MainCachorro {
    public static void main(String[] args) {
        Animal animal = new Animal();

        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }
        else{
            System.out.println("O objeto não é um cachorro");
        }


    }
}
