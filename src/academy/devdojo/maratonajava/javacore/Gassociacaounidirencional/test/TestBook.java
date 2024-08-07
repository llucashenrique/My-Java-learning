package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.test;

import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Book;
import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Library;

public class TestBook {
    public static void main(String[] args) {
        Library library = new Library("Central Library");

        Book book1 = new Book("Java Programming", "John Doe", 2000);
        Book book2 = new Book("Data Structures", "Jane Doe", 2018);
        Book book3 = new Book("algorithms", "Alan Turing", 1950);

        Book[] books = {book1, book2, book3};

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        library.printer();


        System.out.println("Which is the Author of book 'Java Programming'? ");
        for (Book book : books) {
            if (book.getTitle().equals("Java Programming")) {
                System.out.println("Author of books 'Java Programming': " + book.getAuthor());
                break;
            }
        }
    }
}
