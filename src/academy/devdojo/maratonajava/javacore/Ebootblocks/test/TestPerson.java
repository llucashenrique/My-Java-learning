package academy.devdojo.maratonajava.javacore.Ebootblocks.test;

import academy.devdojo.maratonajava.javacore.Ebootblocks.domain.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person(" ", 0);
        Person person2 = new Person("lucas", 1);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println("------------");

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}
