package academy.devdojo.maratonajava.introduction;


import java.util.Arrays;

public class rgrg {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 5, 4};
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            num = array[i] - array[i];
            System.out.println(num);
        }

        System.out.println("-------------------");

        int[] array2 = {0, 1, 67, 34, 54};
        int[] array3 = {5, 67, 10, 54};

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                if (array2[i] == array3[j]) {
                    System.out.println("Iguais");
                } else {
                    System.out.println("Diferentes");
                }
            }
        }

        System.out.println("-----------------");

        int[] array4 = {0, 1, 67, 34, 54};
        int[] array5 = {5, 67, 10, 54};
        int cont1 = 0;
        int cont2 = 0;
        int k = 0;
        int n = 0;

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                if (array4[i] == array5[j]) {
                     k =cont1++;
                } else {
                     n =cont2++;
                }
            }
            System.out.println(k);
            System.out.println(n);

        }
    }
}
