package exerciciosDeException;

public class ConversaoStringParaNumero {
    public static void main(String[] args) {
        String stringInvalida = "abc";
        String stringValida = "123";
        int conversao =0;

        try{
           conversao = Integer.parseInt(stringValida);
            System.out.println("Conversão bem sucedida! O número é "+stringValida);
        }catch (NumberFormatException n){
            System.out.println("String " +stringInvalida+" não pode ser convertida para número");
        }
        System.out.println("Fim do programa");

    }
}
