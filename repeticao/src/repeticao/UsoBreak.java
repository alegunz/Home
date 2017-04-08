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
public class UsoBreak {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i = 0, soma = 0, x;

        while (i < 10) {
            System.out.println("Digite o item " + i);
            x = ler.nextInt();
            if (x < 0) {
                System.err.println("Número Inválido!");
                break;
            }
            soma = soma + x;
            i++;
        }
        System.out.println("Total: " + soma);
    }

}
