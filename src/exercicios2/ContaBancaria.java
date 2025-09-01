package exercicios2;

public class ContaBancaria {
    private double deposita;
    private double saca;
    protected double saldoConta;

    public void depositar(double deposita){
        if(deposita>0){
            System.out.println("Você escolheu depositar R$ "+deposita);
            saldoConta = deposita;
            System.out.println("Saldo atualizado R$ "+saldoConta);
        }
        else{
            System.out.println("Valor inválido para depósito");
        }

    }
    public void sacar (double saca){
        if(saca > saldoConta){
            System.out.println("Saldo insuficiente");
        }
        else if(saldoConta>0){
            System.out.println("Valor sacado R$ "+saca);
            saldoConta = saldoConta-saca;
            System.out.println("Saldo atualizado R$ "+saldoConta);
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo atual R$ "+saldoConta);
    }

    public double getDeposita() {
        return deposita;
    }

    public double getSaca() {
        return saca;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
}
