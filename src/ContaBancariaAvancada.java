public class ContaBancariaAvancada {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        }else{
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}

public class ContaCorrente extends ContaBancariaAvancada{
    private double tarifaMensal;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}


public class TesteContaBancaria{
    public static void main(String[]args){
        ContaBancariaAvancada conta = new ContaBancariaAvancada();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}

