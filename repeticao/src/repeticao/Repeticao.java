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
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int x, soma = 0;
        
        for (int i = 0; i < 100; i++) { 
            System.out.println("Digite o item " + i);
            x = ler.nextInt();
            soma = soma + x;
        }
        System.out.println("TOTAL: "+ soma);
    }
    
}
