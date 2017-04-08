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
public class Ex4Sala {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i = 0, entrada, soma = 0, media, quantidade = 0;

        System.out.println("Digite 6 valores: ");

        while (i < 6) {

            entrada = ler.nextInt();

            if (entrada > 0) {
                soma = soma + entrada;
                quantidade++;
                i++;
            }

        }
        media = soma / quantidade;

        System.out.printf("\nSoma: %d\nQuantidade: %d\nMédia: %d\n", soma, quantidade, media);
    }

}
