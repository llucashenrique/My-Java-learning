package academy.devdojo.maratonajava.javacore.Dbuilders.test;

import academy.devdojo.maratonajava.javacore.Dbuilders.dominio.Book;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("", "", 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("Which is your favorite author about books? ");
        book.setTitle(sc.next());

        System.out.println("Which is your title favorite about books? ");
        book.setAuthor(sc.next());

        System.out.println("Which is a year of publication of this book ? ");
        book.setYearPublication(sc.nextInt());

        book.Printer();
    }
}
