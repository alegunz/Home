/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somados10000;

/**
 *
 * @author andre.ayamamoto
 */
public class SomaDos10000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int soma = 0, n = 1;

        for (int i = 0; i < 10000; i++) {
            
            
            soma = soma + n;
            n = n + 2;
        }

        System.out.println(soma);
    }

}
