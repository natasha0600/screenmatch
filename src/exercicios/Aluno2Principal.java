package exercicios;

public class Aluno2Principal {
    public static void main(String[] args) {
        Aluno2 aluno = new Aluno2();
        aluno.setNome("Natasha");
        aluno.setNota1(8);
        aluno.setNota2(5);
        aluno.setNota3(2);

        System.out.println("Nome do aluno: "+aluno.getNome());
        System.out.println("Nota1: "+aluno.getNota1());
        System.out.println("Nota2: "+aluno.getNota2());
        System.out.println("Nota3: "+aluno.getNota3());
        System.out.println("Média do aluno: "+aluno.calcularMedia());


    }
}
