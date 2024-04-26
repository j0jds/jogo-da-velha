import java.util.Scanner;

public class JogoDaVelha {

    /** Definição de Variáveis. */

    public static void main(String[] args) {

        Campo[][] Jogo = new Campo[3][3];
        char simboloAtual = 'X';
        Boolean game = true;
        String vitoria = " ";
        Scanner scan = new Scanner(System.in);

        iniciarJogo(Jogo);

        while (game) {

            jogoTela(Jogo);
            vitoria = verificaVitoria(Jogo);
            if (!vitoria.equals("")) {
                System.out.printf("Jogador %s venceu!%n", vitoria);
                break;
            }

            try { 

            if (verificaJogada(Jogo, jogar(scan, simboloAtual), simboloAtual)) {
                if(simboloAtual == 'X') {
                    simboloAtual = 'O';

                } else {

                    simboloAtual = 'X';

                }

            }


            } catch (Exception e) {

                System.out.printf("Erro");

            }

        }

        System.out.printf("Fim do Jogo");

    }

    public static void jogoTela(Campo[][] Jogo) {
        // limpaTela();

        System.out.println("   0    1    2 ");
        System.out.printf("0  %c | %c | %c %n", Jogo[0][0].getLetra(), Jogo[0][1].getLetra(), Jogo[0][2].getLetra());
        System.out.println("  ------------- ");
        System.out.printf("1  %c | %c | %c %n", Jogo[1][0].getLetra(), Jogo[1][1].getLetra(), Jogo[1][2].getLetra());
        System.out.println("  ------------- ");
        System.out.printf("2  %c | %c | %c %n", Jogo[2][0].getLetra(), Jogo[2][1].getLetra(), Jogo[2][2].getLetra());

    }

    public static void limpaTela() {

        for (int cont = 0; cont < 200; cont++) {
            System.out.println("");
        }

    }

    public static int[] jogar(Scanner scan, char letra){

        int p[] = new int[2];
        System.out.printf("%s %c%n", "Jogada: ", letra);
        System.out.print("Informe a linha: ");
        p[0] = scan.nextInt();
        System.out.print("Informe a coluna: ");
        p[1] = scan.nextInt();
        return p;
    }



    public static Boolean verificaJogada(Campo[][] Jogo, int p[], char simboloAtual) {

        if(Jogo[p[0]][p[1]].getLetra() == ' ') {
            Jogo[p[0]][p[1]].setLetra(simboloAtual);
            return true;
        } else {
            return false;
        }


    }


    public static void iniciarJogo(Campo[][] Jogo){
        for (int i=0; i<3; i++) {
            for (int c=0; c<3; c++){
                Jogo[i][c] = new Campo();
            }
        }


    }


    public static String verificaVitoria(Campo[][] Jogo) {
        return "";

    }

}
