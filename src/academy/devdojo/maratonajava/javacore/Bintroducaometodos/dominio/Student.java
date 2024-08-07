package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Student {

    public String name;
    public int age;
    public char sex;

    public void printer(){
        System.out.println("----------------------");
        System.out.println(this.sex);
        System.out.println(this.name);
        System.out.println(this.age);

    }

}
