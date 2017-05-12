/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecta4;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Conecta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("---Conecta 4---");

        System.out.printf("  1   2   3   4   5   6   7   (COLUNAS)"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n6 | %s | %s | %s | %s | %s | %s | %s |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n5 | %s | %s | %s | %s | %s | %s | %s |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n4 | %s | %s | %s | %s | %s | %s | %s |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n3 | %s | %s | %s | %s | %s | %s | %s |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n2 | %s | %s | %s | %s | %s | %s | %s |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n1 | %s | %s | %s | %s | %s | %s | %s |"
                + "\n  - - - - - - - - - - - - - - -\n");
        
        
        //Entrada----------
        
        
        //Processo----------
        String matriz[][] = new String[6][7];//[linha] e [coluna]
        int certo = 0;
        do {
            String jogador1 = "", jogador2 = "";
            
            System.out.print("Escolha uma coluna: ");
            int coluna = ler.nextInt();
            
            System.out.print("Escolha uma linha: ");
            int linha = ler.nextInt();

//            for (linha = 0; linha < 0; linha++) {
  //              for (coluna = 0; coluna < 0; coluna++){
    //                
      //          }
        //    }

            System.out.printf("  1   2   3   4   5   6   7   (COLUNAS)"
                    + "\n  - - - - - - - - - - - - - - -"
                    + "\n6 | %s | %s | %s | %s | %s | %s | %s |", matriz[5][0], matriz[5][1], matriz[5][2], matriz[5][3], matriz[5][4], matriz[5][5], matriz[5][6]//SE TROCAR OS NUMEROS POR COLUNA E LINHA SERIA O MODO MANUAL DA COISA
                    + "\n  - - - - - - - - - - - - - - -"
                    + "\n5 | %s | %s | %s | %s | %s | %s | %s |", matriz[4][0], matriz[4][1], matriz[4][2], matriz[4][3], matriz[4][4], matriz[4][5], matriz[4][6]//SE TROCAR OS NUMEROS POR COLUNA E LINHA SERIA O MODO MANUAL DA COISA
                    + "\n  - - - - - - - - - - - - - - -"
                    + "\n4 | %s | %s | %s | %s | %s | %s | %s |", matriz[3][0], matriz[3][1], matriz[3][2], matriz[3][3], matriz[3][4], matriz[3][5], matriz[3][6]//SE TROCAR OS NUMEROS POR COLUNA E LINHA SERIA O MODO MANUAL DA COISA
                    + "\n  - - - - - - - - - - - - - - -"
                    + "\n3 | %s | %s | %s | %s | %s | %s | %s |", matriz[2][0], matriz[2][1], matriz[2][2], matriz[2][3], matriz[2][4], matriz[2][5], matriz[2][6]//SE TROCAR OS NUMEROS POR COLUNA E LINHA SERIA O MODO MANUAL DA COISA
                    + "\n  - - - - - - - - - - - - - - -"
                    + "\n2 | %s | %s | %s | %s | %s | %s | %s |", matriz[1][0], matriz[1][1], matriz[1][2], matriz[1][3], matriz[1][4], matriz[1][5], matriz[1][6]//SE TROCAR OS NUMEROS POR COLUNA E LINHA SERIA O MODO MANUAL DA COISA
                    + "\n  - - - - - - - - - - - - - - -"
                    + "\n1 | %s | %s | %s | %s | %s | %s | %s |", matriz[0][0], matriz[0][1], matriz[0][2], matriz[0][3], matriz[0][4], matriz[0][5], matriz[0][6]//SE TROCAR OS NUMEROS POR COLUNA E LINHA SERIA O MODO MANUAL DA COISA
                    + "\n  - - - - - - - - - - - - - - -\n");//QUERO QUE O USUARIO DIGITE A COLUNA DESEJADA E SEU REPRESENTANDO APAREÇA NA LINHA QUE ESTIVER VAZIA(SE CONTER ALGUMA PREENCHIDA)
        } while (certo == 0);
    }

}
