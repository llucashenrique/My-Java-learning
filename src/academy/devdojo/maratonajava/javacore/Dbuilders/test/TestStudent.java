package academy.devdojo.maratonajava.javacore.Dbuilders.test;

import academy.devdojo.maratonajava.javacore.Dbuilders.dominio.Student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(" ", 0, " ");
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name ?");
        student.setName(sc.next());

        System.out.println("What is your age ?");
        student.setAge(sc.nextInt());

        System.out.println("What is your course ?");
        student.setCourse(sc.next());

        student.Printer();
    }
}
