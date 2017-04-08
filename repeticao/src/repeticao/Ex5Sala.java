/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex5Sala {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int N, multiplica, i = 1;

        System.out.println("Digite um número: ");
        N = ler.nextInt();

        if (N >= 2 && N <= 1000) {
            do {
                multiplica = i * N;
                System.out.printf("%d X %d = %d\n", i, N, multiplica);
                i++;
            } while (i <= 10);
        }

    }

}
