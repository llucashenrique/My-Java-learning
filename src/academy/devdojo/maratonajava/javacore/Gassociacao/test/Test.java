package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The bigger Software prediction of the future:  ");
        System.out.println("Enter your question: ");
        String aks = input.nextLine();
        if (aks.charAt(0) == ' ') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
