package academy.devdojo.maratonajava.javacore.Fstaticmodifier.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Bank;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        System.out.println("Set Interest: ");
        Bank.setSetInterest(sc.nextDouble());

        double newTax = Bank.getSetInterest();

        System.out.println("Enter your balance: ");
        double balance = sc.nextDouble();

        newTax = newTax / 100;

        double result = balance + (balance * newTax);

        System.out.println("result: " + result);
    }
}
