/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadigitos;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class SomaDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        //Variáveis
        String numero;

        int soma = 0, p1 = 0, p2 = 1, digito, tamanhoStringi;

        //Entrada
        System.out.print("Digite um número: ");
        numero = ler.next();

        //Processamento
        tamanhoStringi = numero.length();//o comando .length pega o tamanho da string em int provavelmente

        for (int i = 0; i < tamanhoStringi; i++) {// o laço vai funcionar de acordo com o .length(tamanho da String em int)

            digito = Integer.parseInt(numero.substring(p1, p2));//quando for localizar o digito pode-se usar variaveis(p1, p2) isso é bom
            //------------------------ poderia ser digito = Integer.parseInt(numero.substring(i, i + 1))------------------------------------------------------------------------
            
            soma = soma + digito;//aqui é o básico, onde a soma = 0 é cumulativa + o digito

            p1++;//aqui é como eu passo de digito em digito... p1 = 0 e p2 = 1, depois p1 = 1 e p2 = 2.......
            p2++;
        }

        //Saída
        System.out.println(soma);
    }

}
