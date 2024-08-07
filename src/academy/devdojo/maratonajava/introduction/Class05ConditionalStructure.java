package academy.devdojo.maratonajava.introduction;

public class Class05ConditionalStructure {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedToBuyDrinks = age >= 18;

        if (isAuthorizedToBuyDrinks) {
            System.out.println("You are authorized buy drinks");
        }else{
            System.out.println("You not authorized buy drinks");
        }
    }
}
