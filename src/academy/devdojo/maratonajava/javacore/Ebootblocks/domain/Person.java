package academy.devdojo.maratonajava.javacore.Ebootblocks.domain;

public class Person {

    private String name;

    private int age;


    {
        name = "Unknown";

        age = 0;
    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
        Printer();
    }

    public void Printer(){
        System.out.println(age);
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
