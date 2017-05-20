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
public class Ex04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite um número: ");
        int N = ler.nextInt();
        
        
        //Validando
        N = MinhasFunc.numeroPositivoValidacao(N, ler);
        
        
        //Processo
        int produto = MinhasFunc.fatorial(N);//Fatorial
        
        int soma = MinhasFunc.somatoria(N);//Somatoria
        
        int divisao = produto / soma;
        
        //Saída
        System.out.println(divisao);
    }

}
