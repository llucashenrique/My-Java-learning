package academy.devdojo.maratonajava.javacore.Dbuilders.dominio;

public class Anime {
    private String type;
    private int ep;
    private String name;
    private String tv;
    private String studio;

    public Anime(String type, String name, String tv, int ep) {
        this();
        this.type = type;
        this.name = name;
        this.tv = tv;
        this.ep = ep;
    }

    public Anime(String type, String name, String tv, int ep, String studio) {
        this(type, name, tv, ep);
        this.studio = studio;

    }

    public Anime() {
        System.out.println("inside");
    }

    public void Printer() {
        System.out.println(this.type);
        System.out.println(this.ep);
        System.out.println(this.name);
        System.out.println(this.tv);
        System.out.println(this.studio);
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public int getEp() {
        return this.ep;
    }

}