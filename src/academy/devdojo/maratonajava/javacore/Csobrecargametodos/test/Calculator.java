package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Add;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add add = new Add();

        System.out.println("Enter a number: ");
        add.setNum1(sc.nextInt());

        System.out.println("Enter a number: ");
        add.setNum2(sc.nextInt());

        System.out.println("Enter a number: ");
        add.setNum3(sc.nextDouble());

        System.out.println("Enter a number: ");
        add.setNum4(sc.nextDouble());

        add.init(add.getNum1(), add.getNum2(), add.getNum3(), add.getNum4());
    }
}
