package academy.devdojo.maratonajava.javacore.Fstaticmodifier.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Bank;
import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Business;

import java.util.Scanner;

public class TestBusiness {
    public static void main(String[] args) {
        Business business = new Business();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of employees: ");
        Bank.setSetInterest(sc.nextDouble());

        System.out.println(Bank.getSetInterest());
    }
}
