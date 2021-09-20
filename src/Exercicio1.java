public class Exercicio1 {
    public static void main(String[] args) {
        Carro gol = new Carro();

        gol.nome = "Gol g5 2009";
        gol.peso = 934;
        gol.fabricante = "Volkswagem";
        gol.cor = "vermelho";
        gol.valor = 13900;

        System.out.println(gol.valor);
        System.out.println(gol.cor);
        gol.darDesconto(15);
        System.out.println(gol.valor);
        gol.pintar("rosa");
        System.out.println(gol.cor);

    }
}
