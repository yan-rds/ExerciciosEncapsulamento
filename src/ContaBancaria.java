public class ContaBancaria {
    String numeroDaConta;
    double saldo;
    String nomeDoCorrentista;

    public ContaBancaria (String numeroDaConta, double saldo, String nomeDoCorrentista){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
    public void saque (double valorSacado){
        saldo = saldo - valorSacado;
    }
    public void deposito (double valorDepositado){
        saldo = saldo + valorDepositado;
    }
    public void extrato (){
        System.out.println(nomeDoCorrentista);
        System.out.println(numeroDaConta);
        System.out.println(saldo);
    }

}
