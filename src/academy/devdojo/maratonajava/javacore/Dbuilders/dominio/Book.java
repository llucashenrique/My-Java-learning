package academy.devdojo.maratonajava.javacore.Dbuilders.dominio;

public class Book {

    private String title;
    private String author;
    private int yearPublication;

    public Book(String title, String author, int yearPublication){
        this();
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public Book(){

    }

    public void Printer(){
        System.out.println(this.author);
        System.out.println(this.title);
        System.out.println(this.yearPublication);
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }


}
