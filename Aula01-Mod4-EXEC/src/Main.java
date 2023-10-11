import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean jogoFinalizado = false;
        char[][] tabuleiro = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        char jogadorAtual = 'X';
        Scanner sc = new Scanner(System.in);


        do {
            //EXIBIÇÃO DO TABULEIRO
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(tabuleiro[i][j]);

                    if(j < 2){
                        System.out.print(" | ");
                    }
                }

                System.out.println();
                if(i < 2){
                    System.out.println("----------");
                }
            }
            System.out.println();
            // FIM DA EXIBIÇÃO DO TABULEIRO

            System.out.println("Jogador " + jogadorAtual + ", é a sua vez");
            int posicaoEscolhida = sc.nextInt();

            if(posicaoEscolhida < 1 && posicaoEscolhida > 9){
                System.out.println("Posição inválida!");
                continue;
            }

            switch (posicaoEscolhida){
                case 1:
                    tabuleiro[0][0] = jogadorAtual;
                    break;
                case 2:
                    tabuleiro[0][1] = jogadorAtual;
                    break;
                case 3:
                    tabuleiro[0][2] = jogadorAtual;
                    break;
                case 4:
                    tabuleiro[1][0] = jogadorAtual;
                    break;
                case 5:
                    tabuleiro[1][1] = jogadorAtual;
                    break;
                case 6:
                    tabuleiro[1][2] = jogadorAtual;
                    break;
                case 7:
                    tabuleiro[2][0] = jogadorAtual;
                    break;
                case 8:
                    tabuleiro[2][1] = jogadorAtual;
                    break;
                case 9:
                    tabuleiro[2][2] = jogadorAtual;
                    break;
            }


            for(int i = 0; i < 3; i++){
                //COMPARANDO AS LINHAS
                if(tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual){
                    System.out.println("Jogador: " + jogadorAtual + " é o vencedor");
                    jogoFinalizado = true;
                    break;
                }

                //COMPARANDO AS COLUNAS
                if(tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual){
                    System.out.println("Jogador: " + jogadorAtual + " é o vencedor");
                    jogoFinalizado = true;
                    break;
                }
            }

            if(tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual){
                System.out.println("Jogador: " + jogadorAtual + " é o vencedor");
                jogoFinalizado = true;
            }

            if(tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual){
                System.out.println("Jogador: " + jogadorAtual + " é o vencedor");
                jogoFinalizado = true;
            }

            if(!jogoFinalizado) {
                jogoFinalizado = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tabuleiro[i][j] != 'X' && tabuleiro[i][j] != 'O') {
                            jogoFinalizado = false;
                        }
                    }
                }
            }

            if(jogoFinalizado){
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        System.out.print(tabuleiro[i][j]);

                        if(j < 2){
                            System.out.print(" | ");
                        }
                    }

                    System.out.println();
                    if(i < 2){
                        System.out.println("----------");
                    }
                }
                System.out.println();
            }

            jogadorAtual = jogadorAtual == 'X' ? 'O' : 'X';

        }while(!jogoFinalizado);
    }
}