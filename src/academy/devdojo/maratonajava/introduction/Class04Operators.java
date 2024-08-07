package academy.devdojo.maratonajava.introduction;

public class Class04Operators {
    public static void main(String[] args)  {
        double n1 = 15;
        double n2 = 10;
        double result = n1 * n2;
        double resultTwo = n1 / n2;
        System.out.println(n1+n2);
        System.out.println(result);
        System.out.println(resultTwo);

        int rest = 21 % 2;
        System.out.println(rest);

        boolean biggerOrSmaller = 10 < 20;
        System.out.println("Bigger or smaller: "+ biggerOrSmaller);

        int age = 35;
        float salary = 3500F;
        boolean isInTheLaw = age > 30 && salary >= 4612;
        boolean isNotInTheLaw = age < 30 && salary <= 3381;
        System.out.println(isInTheLaw);
        System.out.println(isNotInTheLaw);

        double currentAccount = 200;
        double savingsAccount = 10000;
        float valuePlaystation = 5000F;

        boolean isPlaystationShopping = currentAccount  > valuePlaystation || savingsAccount > valuePlaystation;
        System.out.println("isPlaystationShopping: "+isPlaystationShopping);

        // = += -= *= /+ %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int c = 1;
        c++ ;
        c--;
        ++c;
        --c;
        int c2 = 0;
        System.out.println(++c2);
        System.out.println(c);
    }
}
