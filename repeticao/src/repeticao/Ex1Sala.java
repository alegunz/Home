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
public class Ex1Sala {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i = 0, x = 0;

        while (i < 101) {
            boolean pares = x % 2 == 0;

            if (pares) {

                System.out.println(x);
                i++;
                x++;
            }
            i++;
            x++;

        }
    }

}
