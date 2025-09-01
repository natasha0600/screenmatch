package exercicios;

public class Livro {
    private String nome;
    private String titulo;

    public String getNome() {
        return nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void exibirDetalhes(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+nome);
    }
}
