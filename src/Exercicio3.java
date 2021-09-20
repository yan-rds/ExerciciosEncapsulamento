public class Exercicio3 {
    public static void main(String[] args) {
        Elevador predioDe15 = new Elevador(15);

        System.out.println(predioDe15.pessoasNele);
        predioDe15.entra(10);
        System.out.println(predioDe15.pessoasNele);
        predioDe15.sobe();
        predioDe15.entra(6);
        predioDe15.sobe();
        predioDe15.sai(8);
        System.out.println(predioDe15.pessoasNele);
        predioDe15.sobe();
        predioDe15.sai(12);
        System.out.println(predioDe15.pessoasNele);
        predioDe15.sobe();
        predioDe15.entra(5);
        System.out.println(predioDe15.pessoasNele);


    }
}
