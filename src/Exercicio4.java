public class Exercicio4 {
    public static void main(String[] args) {
        CartaoDeCredito joao = new CartaoDeCredito(500, "João Feijão");

        System.out.println(joao.limite);
        joao.realizaCompra(600);
        joao.aumentaLimite(200);
        joao.realizaCompra(600);
        joao.imprimeFatura();
        System.out.println(joao.limite);
        joao.diminuiLimite(50);
        System.out.println(joao.limite);

    }
}
