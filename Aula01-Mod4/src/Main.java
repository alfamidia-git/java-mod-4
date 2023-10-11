import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5]; //aqui estamos criando um array de 5 posições
        array[0] = 10;//1
        array[1] = 20;//2
        array[2] = 30;//3
        array[3] = 40;//4
        array[4] = 50;//5

        System.out.println(array[4]);

        for(int i = 0; i < array.length; i++){
            System.out.println("Posição: " + i + " - Valor: " + array[i]);
        }

        System.out.println("====================================");



        int[][] matriz = new int[3][4];
        matriz[0][0] = 10;
        matriz[1][0] = 100;
        matriz[2][0] = 1000;

        matriz[0][1] = 20;
        matriz[1][1] = 200;
        matriz[2][1] = 2000;

        matriz[0][2] = 30;
        matriz[1][2] = 300;
        matriz[2][2] = 3000;

        matriz[0][3] = 40;
        matriz[1][3] = 400;
        matriz[2][3] = 4000;

        for (int i = 0; i < matriz.length; i++) {
            // Loop para percorrer as colunas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            // Quebra de linha após cada linha da matriz
            System.out.println();
        }
    }
}