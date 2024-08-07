package academy.devdojo.maratonajava.javacore.Fstaticmodifier.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Counter;

import java.util.Scanner;

public class TestCounter {
    public static void main(String[] args) {
        Counter counter = new Counter(0, 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with a counter: ");
        Counter.setCounter(sc.nextDouble());

        System.out.println("Enter with a increase: ");
        Counter.setIncrease(sc.nextDouble());

        counter.Printer();

    }
}
