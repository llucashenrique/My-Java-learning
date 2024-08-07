package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Person;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        System.out.println("what's your name? ");
        person.setName(sc.next());

        System.out.println("What's your age? ");
        person.setAge(sc.nextInt());

        person.init(person.getName(), person.getAge());

    }
}
