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
        num = MinhasFunc.numeroPositivoValidacao(num, ler);

        //Processo
        num = MinhasFunc.somatoria(num);

        //Saída
        System.out.println(num);
    }

}
