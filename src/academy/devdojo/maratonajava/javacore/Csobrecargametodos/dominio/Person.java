package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Person {
    private String name;
    private int age;

    public void init(String name, int age) {
        this.name = name;
        this.age = age;
        this.Printer();
    }

    private void Printer() {
        System.out.println(name);
        System.out.println(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
