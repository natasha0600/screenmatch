package exercicios;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1234);
        conta.setTitular("Natasha");
        conta.setSaldo(1300);

        System.out.println("Numero da conta: "+conta.getNumeroConta());
        System.out.println("Nome do titular: "+conta.getTitular());
        System.out.println("Saldo da conta: "+conta.getSaldo());
    }
}
