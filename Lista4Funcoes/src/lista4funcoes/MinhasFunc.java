/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4funcoes;

import static java.lang.Math.PI;
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
        if (primeiraParte < 0) {
            return -1;
        } else {
            raiz1 = (-b + (segundaParte)) / (2 * a);
            raiz2 = (-b - (segundaParte)) / (2 * a);
            if (raiz1 > raiz2) {
                return raiz1;
            } else {
                return raiz2;
            }
        }

    }

    public static double bhaskaraComEscolha(double a, double b, double c, int escolha) {

        double primeiraParte, segundaParte, raiz1, raiz2;

        primeiraParte = (Math.pow(-b, 2)) - (4 * a * c);
        segundaParte = Math.sqrt(primeiraParte);
        raiz1 = (-b + (segundaParte)) / (2 * a);
        raiz2 = (-b - (segundaParte)) / (2 * a);

        if (primeiraParte < 0) {
            System.out.println("\n\nO Delta deu negativo.");
            return -1;
        } else {
            switch (escolha) {
                case 1:
                    if (raiz1 > raiz2) {
                        return raiz1;
                    } else {
                        return raiz2;
                    }
                case 2:
                    if (raiz1 < raiz2) {
                        return raiz1;
                    } else {
                        return raiz2;
                    }
                default:
                    return 0;
            }//Fim do switch
        }
    }

    public static double volumePorRaio(double raio) {

        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        return volume;

    }

    public static boolean primo(int num) {

        int testeprimo = 0;
        boolean ehprimo;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                testeprimo++;
            }
        }
        ehprimo = (testeprimo == 2);
        return ehprimo;

    }
}
