/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package lista4funcoes;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();
        
        //Validação
        num = validandoNum(num, ler);
        
        //Processo        
        num = somatoria(num);
        
        //Saída
        System.out.println(num);
    }

    public static int validandoNum(int num, Scanner ler) {
        //Validando o num
        while (num < 0) {
            System.out.print("Digite um número maior que 0: ");
            num = ler.nextInt();
        }
        return num;
    }

    public static int somatoria(int N) {
        
        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        N = soma;
        return N;
    }
}
