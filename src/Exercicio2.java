public class Exercicio2 {
    public static void main(String[] args) {

        ContaBancaria joao = new ContaBancaria("12345", 200, "joao sebastiao");

        joao.extrato();
        joao.deposito(100);
        joao.extrato();
        joao.saque(150);
        joao.extrato();


    }
}
