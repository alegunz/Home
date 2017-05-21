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

    public static Scanner ler = new Scanner(System.in);

    public static int entradaInt() {

        System.out.print("Digite:");
        int x = ler.nextInt();
        return x;

    }

    public static double entradaDb() {

        System.out.print("Digite:");
        double x = ler.nextDouble();
        return x;

    }

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

    public static double bhaskara(double a, double b, double c) {

        double primeiraParte, segundaParte, raiz1, raiz2;

        primeiraParte = (Math.pow(-b, 2)) - (4 * a * c);
        segundaParte = Math.sqrt(primeiraParte);
        if (segundaParte < 0.0) {
            double x = -1;
            return x;
        }
        raiz1 = (-b + (segundaParte)) / (2 * a);
        raiz2 = (-b - (segundaParte)) / (2 * a);

        if (raiz1 > raiz2) {
            return raiz1;
        } else {
            return raiz2;
        }

    }

}
