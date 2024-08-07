package academy.devdojo.maratonajava.javacore.Fstaticmodifier.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Math;

import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        Math math = new Math();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a two numbers of add: ");
        Math.setAdd(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter a two numbers of subtract: ");
        Math.setSubtract(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter a two numbers of multiplication: ");
        Math.setMultiplication(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter a two numbers of division: ");
        Math.setDivision(sc.nextDouble(), sc.nextDouble());

        math.Printer();




    }
}
