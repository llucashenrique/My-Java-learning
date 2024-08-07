package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.BankAccounte;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BankAccounte account = new BankAccounte();
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your number account? ");
        account.setAccountNumber(sc.next());

        System.out.println("How much money do you have ir your account? ");
        account.setBalance(sc.nextDouble());

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());


        System.out.println("Enter your deposit: ");
        account.deposite(sc.nextDouble());

        System.out.println("Balance after deposit: " + account.getBalance());

        System.out.println("How much do want retired of your account? ");
        account.withdrawe(sc.nextDouble());

        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}

