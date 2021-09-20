public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    public void darDesconto(double desconto){
    valor = valor - ((valor * desconto)/100);
    }

    public void pintar (String novaCor){
    cor = novaCor;
    }
}


