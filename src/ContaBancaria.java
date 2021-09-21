public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;
    private String nomeDoCorrentista;

    public ContaBancaria (String numeroDaConta, double saldo, String nomeDoCorrentista){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void saque (double valorSacado){
        saldo = getSaldo() - valorSacado;
    }

    public void deposito (double valorDepositado){
        saldo = getSaldo() + valorDepositado;
    }

    public void extrato (){
        System.out.println(getNomeDoCorrentista());
        System.out.println(getNumeroDaConta());
        System.out.println(getSaldo());
    }

}
