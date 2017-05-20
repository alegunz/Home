/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4funcoes;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class MinhasFunc {

    public static int somatoria(int N) {

        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        return soma;
    }

    public static int fatorial(int n) {
        int multiplica = 1;
        for (int i = 1; i <= n; i++) {
            multiplica *= i;
        }
        return multiplica;
    }

    public static int numeroPositivoValidacao(int num, Scanner ler) {

        while (num < 0) {
            System.out.print("Digite um número maior que 0: ");
            num = ler.nextInt();
        }
        return num;
    }

}
