package exerciciosDeException;

import java.util.Scanner;

public class ErroIdadeInvalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        String idadeValida = sc.nextLine();
        try{
            validaIdade(idadeValida);
            System.out.println("Idade válida!");
            System.out.println("Programa finalizado!");
        }catch (IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Erro de validação, não foi digitado um número");
        }

    }
    private static void validaIdade(String idadeValida) throws NumberFormatException, IdadeInvalidaException{
        int conversao = Integer.parseInt(idadeValida);
        if(conversao > 150 || conversao < 1 ){
            throw new IdadeInvalidaException("Idade maior que 150 anos ou idade negativa! Digite novamente");
        }
    }

}
