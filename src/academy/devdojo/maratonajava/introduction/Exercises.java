package academy.devdojo.maratonajava.introduction;

import java.util.Random;


public class Exercises {
    static int[][] criaMatriz(int N, int M) {
        int[][] matriz = new int[N][M];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Random gerador = new Random();
                matriz[i][j] = gerador.nextInt(100);
            }
        }

        return matriz;
    }

    static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println("\n");
        }
    }

    static int[][] transposta(int[][] matriz) {
        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }

        return matrizTransposta;
    }


    public static void main(String[] args) {
        int[][] matriz = criaMatriz(3, 4);
        imprimeMatriz(matriz);
        System.out.println();
        int[][] transposta = transposta(matriz);
        imprimeMatriz(transposta);
    }
}


