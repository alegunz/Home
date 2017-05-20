/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package lista4funcoes;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex01 {

    public static void main(String[] args) {

        //Entrada
        System.out.println("Escreva três números: ");

        //Processo
        int menor = 0;
        for (int i = 1; i < 4; i++) {
            System.out.printf("%dº número: ", i);
            menor = retornaMenor(menor);
        }

        //Saída  
        System.out.printf("O menor número é: %d\n", menor);
    }

    //Função usada no processo
    public static int retornaMenor(int menor) {

        Scanner ler = new Scanner(System.in);

        int num = ler.nextInt();

        if (num < menor) {
            menor = num;
        }

        return menor;
    }
}
