package exercicios2;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldoConta -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldoConta);
    }

}


