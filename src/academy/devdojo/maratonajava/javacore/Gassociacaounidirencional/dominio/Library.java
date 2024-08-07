package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio;

import java.util.ArrayList;

public class Library {
    private String name;

    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }


    public void addBooks(Book book) {
        books.add(book);
    }

    public void printer() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println("-------------------");
        }
    }
}
