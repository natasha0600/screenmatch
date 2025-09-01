package exercicios;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Tenis Vans");
        produto.setPreco(49);
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço R$ "+produto.getPreco());
        produto.aplicarDesconto(10);
    }
}
