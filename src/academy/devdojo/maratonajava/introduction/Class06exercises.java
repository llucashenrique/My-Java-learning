package academy.devdojo.maratonajava.introduction;

public class Class06exercises {
    public static void main(String[] args) {
        double salary = 70000;
        double tax ;
        if (salary <= 34712){
            tax = salary * 0.097;
            salary = salary - tax;
        } else if (salary >= 34713 && salary <= 68507){
            tax = salary * 0.3735;
            salary = salary - tax;
        }else{
            tax = salary * 0.4950;
            salary = salary - tax;
        }
        System.out.println("Your tax: "+tax);
        System.out.println("Your salary: "+salary);
    }
}
