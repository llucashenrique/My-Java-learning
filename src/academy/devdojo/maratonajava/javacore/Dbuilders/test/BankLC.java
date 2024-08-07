package academy.devdojo.maratonajava.javacore.Dbuilders.test;

import academy.devdojo.maratonajava.javacore.Dbuilders.dominio.AccountBank;

import java.util.Scanner;

public class BankLC {
    public static void main(String[] args) {
        AccountBank bank = new AccountBank("Lucas", 0710, 2000,500);
        Scanner sc = new Scanner(System.in);

        System.out.println("Who is owner this account ?");
        bank.setOwner(sc.next());

        System.out.println("Which is number this account ?");
        bank.setNumberAccount(sc.nextInt());

        System.out.println("Which value of deposit? ");
        bank.deposite(sc.nextDouble());

        System.out.println("Which value of withdrawal?  ");
        bank.withDrawe(sc.nextDouble());

        System.out.println("How much money do you pay for this account? ");
        bank.setPrice(sc.nextDouble());

        bank.printer();
    }
}
