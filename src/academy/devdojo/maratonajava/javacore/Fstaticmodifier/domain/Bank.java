package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Bank {

    private static double interestRate;

    private static double setInterest;

    private static double getInterest;



    public static double getSetInterest() {
        return setInterest;
    }

    public static void setSetInterest(double setInterest) {
        Bank.setInterest = setInterest;
    }
}

