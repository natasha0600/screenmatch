package exerciciosDeException;

import java.util.Scanner;

public class SenhaUsuarioMain {
    /*Crie um programa que lê uma senha do usuário.
    Utilize o bloco try/catch para capturar a exceção
    SenhaInvalidaException, uma classe de exceção personalizada
    que deve ser lançada caso a senha não atenda a critérios
    específicos (por exemplo, ter pelo menos 8 caracteres).*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crie uma senha que deva ter 8 caracteres");
        String senha = sc.nextLine();

        try{
            validarSenha(senha);

        }catch (SenhaInvalidaException e){
           System.out.println(e.getMessage());
        }

    }

    private static void validarSenha(String senha) {
        if(senha.length() < 8){
            throw new SenhaInvalidaException("A senha deve conter pelo menos 8 caracteres");
        }
    }
}
