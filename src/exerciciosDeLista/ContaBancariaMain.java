package exerciciosDeLista;

import java.util.ArrayList;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ArrayList <ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(new ContaBancaria(123456, 100.50));
        listaContas.add(new ContaBancaria(7891011, 6000.54));
        listaContas.add(new ContaBancaria(101010, 80.00));
        listaContas.add(new ContaBancaria(606060, 800));
        listaContas.add(new ContaBancaria(808080, 6000.55));

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for(ContaBancaria conta: listaContas){
            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com maior saldo - Número: "+contaMaiorSaldo.getNumero()+ ", Saldo: "+contaMaiorSaldo.getSaldo());
    }
}
