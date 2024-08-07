package academy.devdojo.maratonajava.introduction;

import java.util.Random;
import java.util.Scanner;

public class Class08Arrays {
    public static void main(String[] args) {
        int[] age = new int[4];

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        char[] chars = {'m', 'l'};

        for (char aChar : chars) {
            System.out.println(aChar);
        }

        String[] name = new String[4];
        name[0] = "lucas";
        name[1] = "henrique";
        name[2] = "peres";
        name[3] = "lino";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        name = new String[3];

        name[0] = "maria";
        name[1] = "rosa";
        name[2] = "santos";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        int[] num = new int[4];
        int[] num2 = {1,2,3,4};
        int[] num3 = new int[]{1,2,3,4,5};

        for (int i : num3) {

            System.out.println(i);
        }
    }
}
