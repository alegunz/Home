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
public class Ex2Sala {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Até onde: ");
        int X = ler.nextInt();

        for (int i = 0; i <= X; i++) {

            boolean impar = i % 2 != 0;

            if (impar) {
                System.out.println(i);
            }
        }
    }

}
