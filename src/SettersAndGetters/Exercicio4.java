package SettersAndGetters;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv);

        System.out.println("A televisão está no canal " + tv.canais);
        System.out.println("O volume está em " + tv.volume);


        System.out.println("Escolha o que deseja fazer");
        System.out.println("1 - Subir de canal");
        System.out.println("2 - Descer de canal");
        System.out.println("3 - Aumentar o volume");
        System.out.println("4 - diminuir o volume");
        System.out.println("5 - Desligar a TV");
        int escolha = leitor.nextInt();
        while (escolha != 5) {

            System.out.println("1 - Subir de canal");
            System.out.println("2 - Descer de canal");
            System.out.println("3 - Aumentar o volume");
            System.out.println("4 - diminuir o volume");
            System.out.println("5 - Desligar a TV");
            escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    controle.subirCanal();
                    System.out.println("canal "+tv.canais);
                    break;
                case 2:
                    controle.descerCanal();
                    System.out.println("canal "+tv.canais);
                    break;
                case 3:
                    controle.aumentarVolume();
                    System.out.println("volume "+tv.volume);
                    break;
                case 4:
                    controle.diminuirVolume();
                    System.out.println("volume "+tv.volume);
                    break;
            }
        }


    }
}
