public class ContaBancaria {
    private double saldo;

    public ContaBancaria (double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void depositar (double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");

    }

    public void sacar (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
    } 
}
    public void consultarSaldo(){
        System.out.println("Saldo atual: R$ " + saldo);
    }
}