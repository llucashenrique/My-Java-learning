package academy.devdojo.maratonajava.introduction;

public class Class05ConditionalStructure03 {
    public static void main(String[] args) {
        double salary = 5500;
        if (salary > 5000){
            System.out.println("You can donation");
        }else{
            System.out.println("You can't donation");
        }

        double salaryTwo = 5500;
        String messageDonation = "I can donation 500 for Devdojo";
        String messageNotDonation = "I can't condition for donation";
        // (conditional) ? true : false
        String result = salaryTwo > 5000 ? messageDonation : messageNotDonation;
        System.out.println(result);
    }
}
