package jogovelhacompleto;

import java.util.Random;
import java.util.Scanner;

public class JogoVelhaCompleto {

    public static void main(String[] args) {
        Random rng = new Random();
        Scanner console = new Scanner(System.in);
        String a = "1", b = "2", c = "3", d = "4", e = "5", f = "6", g = "7", h = "8", i = "9";
        String simboloP1, simboloP2;
        int posicao = 0, posicaoMaquina = 0, modoGame;
        boolean vitoria = false, p1 = true;

        System.out.println(" " + a + " | " + b + " | " + c + " \n" + "---+---+---\n" + " " + d + " | " + e + " | " + f + " \n" + "---+---+---\n" + " " + g + " | " + h + " | " + i + " ");
        //System.out.println("   |   |   \n" + "---+---+---\n" + "   |   |   \n" + "---+---+---\n" + "   |   |   ");

        System.out.print("Modo de Jogo: 1-(Player 1 VS Player 2) OU 2-(Player 1 VS IA): ");
        modoGame = console.nextInt();
        

        System.out.print("Informe o Simbolo do Player 1(X ou O): ");
        simboloP1 = console.next().toUpperCase();

        if (simboloP1.equals("X")) {
            simboloP2 = "O";
        } else {
            simboloP2 = "X";
        }

        jogarNovamente:
        while (!vitoria) {
            posicaoMaquina = rng.nextInt(9) + 1;
            if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                System.out.print("Informe a posição da jogada(De 1 a 9): ");
                posicao = console.nextInt();
            } else {
                posicao = posicaoMaquina;
            }
            
            try{
            switch (posicao) {
                case 1:
                    if (!a.equals("1")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        a = simboloP1;
                    } else {
                        a = simboloP2;
                    }
                    break;
                case 2:
                    if (!b.equals("2")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        b = simboloP1;
                    } else {
                        b = simboloP2;
                    }
                    break;
                case 3:
                    if (!c.equals("3")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        c = simboloP1;
                    } else {
                        c = simboloP2;
                    }
                    break;
                case 4:
                    if (!d.equals("4")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        d = simboloP1;
                    } else {
                        d = simboloP2;
                    }
                    break;
                case 5:
                    if (!e.equals("5")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        e = simboloP1;
                    } else {
                        e = simboloP2;
                    }
                    break;
                case 6:
                    if (!f.equals("6")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        f = simboloP1;
                    } else {
                        f = simboloP2;
                    }
                    break;
                case 7:
                    if (!g.equals("7")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        g = simboloP1;
                    } else {
                        g = simboloP2;
                    }
                    break;
                case 8:
                    if (!h.equals("8")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        h = simboloP1;
                    } else {
                        h = simboloP2;
                    }
                    break;
                case 9:
                    if (!i.equals("9")) {
                        if (modoGame == 1 || (modoGame == 2 && p1 == true)) {
                            System.out.println("Jogada Invalida! Posição Já Foi Preenchida, Jogue Novamente!");
                        }
                        continue;
                    }
                    if (p1 == true) {
                        i = simboloP1;
                    } else {
                        i = simboloP2;
                    }
                    break;
                default:
                    break;
            }

            vitoria = ((a.equals("X") && b.equals("X") && c.equals("X"))
                    || (d.equals("X") && e.equals("X") && f.equals("X"))
                    || (g.equals("X") && h.equals("X") && i.equals("X"))
                    || (a.equals("X") && d.equals("X") && g.equals("X"))
                    || (b.equals("X") && e.equals("X") && h.equals("X"))
                    || (c.equals("X") && f.equals("X") && i.equals("X"))
                    || (a.equals("X") && e.equals("X") && i.equals("X"))
                    || (c.equals("X") && e.equals("X") && g.equals("X")))
                    || ((a.equals("O") && b.equals("O") && c.equals("O"))
                    || (d.equals("O") && e.equals("O") && f.equals("O"))
                    || (g.equals("O") && h.equals("O") && i.equals("O"))
                    || (a.equals("O") && d.equals("O") && g.equals("O"))
                    || (b.equals("O") && e.equals("O") && h.equals("O"))
                    || (c.equals("O") && f.equals("O") && i.equals("O"))
                    || (a.equals("O") && e.equals("O") && i.equals("O"))
                    || (c.equals("O") && e.equals("O") && g.equals("O")));

            if (!vitoria) {
                p1 = !p1;
            }

            System.out.println("");
            System.out.println(" " + a + " | " + b + " | " + c + " \n" + "---+---+---\n" + " " + d + " | " + e + " | " + f + " \n" + "---+---+---\n" + " " + g + " | " + h + " | " + i + " ");

            if (!a.equals("1") && !b.equals("2") && !c.equals("3")
                    && !d.equals("4") && !e.equals("5") && !f.equals("6")
                    && !g.equals("7") && !h.equals("8") && !i.equals("9")) {
                break;
            }
        }catch (Exception ex){
                System.out.println("Desculpe Comando Inválido, tente Novamente");
        }
        }

        if (vitoria) {
            if (p1 == true) {
                System.out.println("*** O PLAYER 1 (" + simboloP1 + ") VENCEU!!! ***");
            } else if (modoGame == 2 && p1 == false) {
                System.out.println("*** A MÁQUINA (" + simboloP2 + ") VENCEU!!! ***");
            } else {
                System.out.println("*** O PLAYER 2 (" + simboloP2 + ") VENCEU!!! ***");
            }
        } else {
            System.out.println("**** DEU VELHA!!! ****");
        }

    }

}
