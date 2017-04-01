/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listaswitchcase;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex3 {

    public static void main(String[] args) {
        //Variáveis e Entrada
        Scanner ler = new Scanner(System.in);

        double valorUser;
        int valorInteiro, n100 = 0, n50 = 0, n10 = 0, n5 = 0, n1 = 0;

        System.out.println("----Dinheiro----");

        System.out.print("Digite um valor: ");
        valorUser = ler.nextDouble();
        valorInteiro = (int) valorUser;//transforma double em int.
        
        //Checa se o valor é maior, menor ou igual as notas e DA uma variavel para ele.
        if (valorInteiro >= 100) {
            int maior100 = valorInteiro;
        } else if (valorInteiro >= 50 && valorInteiro < 100) {
            int maior50 = valorInteiro;
        } else if (valorInteiro >= 10 && valorInteiro < 50) {
            int maior10 = valorInteiro;
        } else if (valorInteiro >= 5 && valorInteiro < 10) {
            int maior5 = valorInteiro;
        } else if (valorInteiro >= 1 && valorInteiro < 5) {
            int maior1 = valorInteiro;
        } 

//        switch (valorInteiro) {
//            case maior100:
//                if (valorInteiro > 100 || valorInteiro == 100) {
//                    valorInteiro = valorInteiro - 100;
//                    n100 = n100 + 1;
//                }
//                while (valorInteiro > 100);
//                System.out.printf("%d nota(s) de R$100", n100);
//                break;
//            case 50:
//                do {
//                    if (valorInteiro > 50 || valorInteiro == 50) {
//                        valorInteiro = valorInteiro - 50;
//                        n50 = n50+1;
//                    }
//                } while (valorInteiro > 50);
//                System.out.printf("%d nota(s) de R$50",n50);
//                break;
//            case 10:
//                do {
//                    if (valorInteiro > 10 || valorInteiro == 10) {
//                        valorInteiro = valorInteiro - 10;
//                        n10 = n10+1;
//                    }
//                } while (valorInteiro > 10);
//                System.out.printf("%d nota(s) de R$10",n10);
//                break;
//            case 5:
//                do {
//                    if (valorInteiro > 5 || valorInteiro == 5) {
//                        valorInteiro = valorInteiro - 5;
//                        n5 = n5+1;
//                    }
//                } while (valorInteiro > 5);
//                System.out.printf("%d nota(s) de R$5",n5);
//                break;
//            case 1:
//                do {
//                    if (valorInteiro > 1 || valorInteiro == 1) {
//                        valorInteiro = valorInteiro - 1;
//                        n1 = n1+1;
//                    }
//                } while (valorInteiro > 1);
//                System.out.printf("%d nota(s) de R$1",n1);
//                break;
//
//        }
    }

}
