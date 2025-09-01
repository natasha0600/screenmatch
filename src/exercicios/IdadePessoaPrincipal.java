package exercicios;

public class IdadePessoaPrincipal {
    public static void main(String[] args) {
        IdadePessoa p = new IdadePessoa();
        p.setNome("Natasha");
        p.setIdade(18);

        System.out.println("Nome da pessoa: "+p.getNome());
        System.out.println("Idade da pessoa: "+p.getIdade());
        p.verificarIdade();

    }
}
