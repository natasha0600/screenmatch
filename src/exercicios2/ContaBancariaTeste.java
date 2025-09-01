package exercicios2;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(500);
        conta.sacar(500);
        conta.consultarSaldo();
        System.out.println("---------------------------");
        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(200);
        c2.sacar(100);
        c2.consultarSaldo();
        c2.cobrarTarifaMensal();
    }
}
