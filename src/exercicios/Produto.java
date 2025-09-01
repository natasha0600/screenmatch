package exercicios;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        if(preco >=100){
            double desconto = preco * (percentual/100);
            preco -= desconto;

            System.out.println("Novo preço R$ "+preco);
        }
        else{
            System.out.println("Produto não aceita desconto");
        }
    }
}
