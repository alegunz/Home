/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoaproximadodopi;

import static java.lang.Math.PI;

/**
 *
 * @author andre.ayamamoto
 */
public class CalculoAproximadoDoPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double soma = 0;
        double n = 1;

        for (int i = 0; i < 10000; i++) {

            soma = soma + (1 / n);
            n = n + 2;
            soma = soma - (1 / n);
            n = n + 2;
        }

        System.out.println(soma * 4);
        System.out.println(PI);
    }

}
