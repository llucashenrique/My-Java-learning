package academy.devdojo.maratonajava.introduction;

public class Class05ConditionalStructure02 {
    public static void main(String[] args) {
        int age = 45 ;
        String category;
        if (age < 15){
            category = "Category children's";
        } else if (age >= 15 && age < 18) {
            category = "Category juvenile ";
        } else{
            category = "Category adult";
        }
        System.out.println(category);
    }
}
