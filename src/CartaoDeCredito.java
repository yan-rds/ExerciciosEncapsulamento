public class CartaoDeCredito {
    double limite;
    double fatura = 0;
    String nomeDoCliente;

    public CartaoDeCredito (double limite, String nomeDoCliente){
        this.limite=limite;
        this.nomeDoCliente=nomeDoCliente;
    }

    public void aumentaLimite (double valorAumentado){
        limite = limite + valorAumentado;
    }

    public void diminuiLimite (double valorDiminuido){
        limite = limite - valorDiminuido;
    }

    public void realizaCompra (double valorDaCompra){
        if (limite >= valorDaCompra){
            fatura = fatura + valorDaCompra;
            limite = limite - valorDaCompra;
        }
        else {
            System.out.println("Você não tem limite");
        }
    }

    public void imprimeFatura (){
        System.out.println(fatura);
    }

}
