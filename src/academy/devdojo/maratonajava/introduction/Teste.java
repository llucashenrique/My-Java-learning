package academy.devdojo.maratonajava.introduction;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int soma = 0;
        float result = 0;

        for (int i = 0; i < arrays.length; i++) {
            soma += arrays[i];
            result = soma / arrays[i];
        }

        System.out.println("soma " + soma);
        System.out.println("Media " + result);

        System.out.println("------------------------");

        int[] arrays2 = {1, 2, 3, 4, 5};

        for (int i : arrays2) {
            if (i % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
        }

        System.out.println("------------------------------");

        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;
        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;
        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }


        System.out.println("--------------------------");

        int[] multiplication = {1, 2, 3, 4};
        int[] multiplication2 = {1, 2, 3, 4};

        for (int i = 0; i < multiplication.length; i++) {
            for (int j = 0; j < multiplication2.length; j++) {
                System.out.println(multiplication[i] * multiplication2[j]);
            }
        }

        System.out.println("-----------------------------");

        int[] even = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] odd = {5, 5, 9, 6, 7, 221, 644, 151, 231, 84, 54};

        for (int i : even) {
            for (int i1 : odd) {
                if (i % 2 == 0 && i1 % 2 == 1) {
                    System.out.println(i + " " + i1);
                }
            }
        }


        System.out.println("---------------------------");

        int[][] dias2 = new int[3][3];

        dias2[0][0] = 1;
        dias2[0][1] = 2;
        dias2[0][2] = 3;
        dias2[1][0] = 4;
        dias2[1][1] = 5;
        dias2[1][2] = 6;
        dias2[2][0] = 7;
        dias2[2][1] = 8;
        dias2[2][2] = 9;


        for (int[] arr : dias2) {
            for (int i : arr) {
                System.out.println(i);
            }
        }

        System.out.println("-------------------");

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{59, 89, 5, 81};
        arrayInt[1] = new int[]{1, 23, 4, 5};
        arrayInt[2] = new int[]{2, 5, 4, 56};


        for (int[] ints : arrayInt) {
            System.out.println("\n----------");
            for (int num : ints) {
                System.out.print(num + " ");
            }
        }

        System.out.println("--------------------");

        int[][] arrayInt2 = {{0, 1}, {1, 2, 3}, {5, 6, 7}};

        for (int[] ints : arrayInt2) {
            System.out.println("\n----------");
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }
        }

    }
}
