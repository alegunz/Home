/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package conecta4;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Vitoria {

    public static void main(String[] args) {
        
        

/*        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        //String vitoria[] = new String[3];
                        System.out.printf("I: %d-- J: %d-- K: %d-- L: %d\n", i, j, k, l);
        //Segunda linha (1,0) a (1,6)
                            || matriz[1][0].equalsIgnoreCase(matriz[1][1]) && matriz[1][1].equalsIgnoreCase(matriz[1][2]) && matriz[1][2].equalsIgnoreCase(matriz[1][3])
                            || matriz[1][1].equalsIgnoreCase(matriz[1][2]) && matriz[1][2].equalsIgnoreCase(matriz[1][3]) && matriz[1][3].equalsIgnoreCase(matriz[1][4])
                            || matriz[1][2].equalsIgnoreCase(matriz[1][3]) && matriz[1][3].equalsIgnoreCase(matriz[1][4]) && matriz[1][4].equalsIgnoreCase(matriz[1][5])
                            || matriz[1][3].equalsIgnoreCase(matriz[1][4]) && matriz[1][4].equalsIgnoreCase(matriz[1][5]) && matriz[1][5].equalsIgnoreCase(matriz[1][6])
                            //Terceira linha (2,0) a (2,6)
                            || matriz[2][0].equalsIgnoreCase(matriz[2][1]) && matriz[2][1].equalsIgnoreCase(matriz[2][2]) && matriz[2][2].equalsIgnoreCase(matriz[2][3])
                            || matriz[2][1].equalsIgnoreCase(matriz[2][2]) && matriz[2][2].equalsIgnoreCase(matriz[2][3]) && matriz[2][3].equalsIgnoreCase(matriz[2][4])
                            || matriz[2][2].equalsIgnoreCase(matriz[2][3]) && matriz[2][3].equalsIgnoreCase(matriz[2][4]) && matriz[2][4].equalsIgnoreCase(matriz[2][5])
                            || matriz[2][3].equalsIgnoreCase(matriz[2][4]) && matriz[2][4].equalsIgnoreCase(matriz[2][5]) && matriz[2][5].equalsIgnoreCase(matriz[2][6])
                            //Quarta linha (3,0) a (3,6)
                            || matriz[4][0].equalsIgnoreCase(matriz[4][1]) && matriz[4][1].equalsIgnoreCase(matriz[4][2]) && matriz[4][2].equalsIgnoreCase(matriz[4][3])
                            || matriz[4][1].equalsIgnoreCase(matriz[4][2]) && matriz[4][2].equalsIgnoreCase(matriz[4][3]) && matriz[4][3].equalsIgnoreCase(matriz[4][4])
                            || matriz[4][2].equalsIgnoreCase(matriz[4][3]) && matriz[4][3].equalsIgnoreCase(matriz[4][4]) && matriz[4][4].equalsIgnoreCase(matriz[4][5])
                            || matriz[4][3].equalsIgnoreCase(matriz[4][4]) && matriz[4][4].equalsIgnoreCase(matriz[4][5]) && matriz[4][5].equalsIgnoreCase(matriz[4][6])
                            // Quinta linha (5,0) a (5,6)
                            || matriz[5][0].equalsIgnoreCase(matriz[5][1]) && matriz[5][1].equalsIgnoreCase(matriz[5][2]) && matriz[5][2].equalsIgnoreCase(matriz[5][3])
                            || matriz[5][1].equalsIgnoreCase(matriz[5][2]) && matriz[5][2].equalsIgnoreCase(matriz[5][3]) && matriz[5][3].equalsIgnoreCase(matriz[5][4])
                            || matriz[5][2].equalsIgnoreCase(matriz[5][3]) && matriz[5][3].equalsIgnoreCase(matriz[5][4]) && matriz[5][4].equalsIgnoreCase(matriz[5][5])
                            || matriz[5][3].equalsIgnoreCase(matriz[5][4]) && matriz[5][4].equalsIgnoreCase(matriz[5][5]) && matriz[5][5].equalsIgnoreCase(matriz[5][6])
                    }
                }
            }
        
        switch (linha) {
                case 0:
                    if ( //Coluna 0 a 3 ou 1 a 4
                            (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))
                            || //Coluna 1 a 4 ou 2 a 5
                            (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                            || //Coluna 2 a 5 ou 3 a 6
                            (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                            && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))) {
                        System.out.printf("\nVitória do %s!!!", jogador);
                        certo++;
                        break;
                    } else if ((coluna - 1) >= 3) {
                        if ( //Coluna 3 a 6 ou 4 a 7
                                (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 5].equalsIgnoreCase(jogador))
                                || (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))) {
                            System.out.printf("\nVitória do %s!!!", jogador);
                            certo++;
                            break;
                        }
                    }
                    break;
                case 1:
                    if ((coluna - 1) < 3) {
                        if ( //Coluna 0 a 3 ou 1 a 4
                                (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))
                                || //Coluna 1 a 4 ou 2 a 5
                                (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                || //Coluna 2 a 5 ou 3 a 6
                                (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))) {
                            System.out.printf("\nVitória do %s!!!", jogador);
                            certo++;
                            break;
                        } else if ((coluna - 1) >= 3) {
                            if ( //Coluna 3 a 6 ou 4 a 7
                                    (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 5].equalsIgnoreCase(jogador))
                                    || (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))) {
                                System.out.printf("\nVitória do %s!!!", jogador);
                                certo++;
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    if ((coluna - 1) < 3) {
                        if ( //Coluna 0 a 3 ou 1 a 4
                                (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))
                                || //Coluna 1 a 4 ou 2 a 5
                                (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                || //Coluna 2 a 5 ou 3 a 6
                                (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))) {
                            System.out.printf("\nVitória do %s!!!", jogador);
                            certo++;
                            break;
                        } else if ((coluna - 1) >= 3) {
                            if ( //Coluna 3 a 6 ou 4 a 7
                                    (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 5].equalsIgnoreCase(jogador))
                                    || (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))) {
                                System.out.printf("\nVitória do %s!!!", jogador);
                                certo++;
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    if ((coluna - 1) < 3) {
                        if ( //Coluna 0 a 3 ou 1 a 4
                                (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))
                                || //Coluna 1 a 4 ou 2 a 5
                                (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                || //Coluna 2 a 5 ou 3 a 6
                                (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))) {
                            System.out.printf("\nVitória do %s!!!", jogador);
                            certo++;
                            break;
                        } else if ((coluna - 1) >= 3) {
                            if ( //Coluna 3 a 6 ou 4 a 7
                                    (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 5].equalsIgnoreCase(jogador))
                                    || (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))) {
                                System.out.printf("\nVitória do %s!!!", jogador);
                                certo++;
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    if ((coluna - 1) < 3) {
                        if ( //Coluna 0 a 3 ou 1 a 4
                                (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))
                                || //Coluna 1 a 4 ou 2 a 5
                                (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                || //Coluna 2 a 5 ou 3 a 6
                                (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))) {
                            System.out.printf("\nVitória do %s!!!", jogador);
                            certo++;
                            break;
                        } else if ((coluna - 1) >= 3) {
                            if ( //Coluna 3 a 6 ou 4 a 7
                                    (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 5].equalsIgnoreCase(jogador))
                                    || (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))) {
                                System.out.printf("\nVitória do %s!!!", jogador);
                                certo++;
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    if ((coluna - 1) < 3) {
                        if ( //Coluna 0 a 3 ou 1 a 4
                                (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))
                                || //Coluna 1 a 4 ou 2 a 5
                                (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                || //Coluna 2 a 5 ou 3 a 6
                                (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))) {
                            System.out.printf("\nVitória do %s!!!", jogador);
                            certo++;
                            break;
                        } else if ((coluna - 1) >= 3) {
                            if ( //Coluna 3 a 6 ou 4 a 7
                                    (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 3].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 4].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 5].equalsIgnoreCase(jogador))
                                    || (matriz[linha][coluna + 2].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna + 1].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna].equalsIgnoreCase(jogador))
                                    && (matriz[linha][coluna - 1].equalsIgnoreCase(jogador))) {
                                System.out.printf("\nVitória do %s!!!", jogador);
                                certo++;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Algo errado.\nLinha inválida.");
                    break;
            }
        }*/

    }

}
