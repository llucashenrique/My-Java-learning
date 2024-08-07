package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String type;
    private int ep;
    private String name;
    private String tv;

    public void init(String type, String name, String tv) {
        this.type = type;
        this.name = name;
        this.tv = tv;
    }

    public void init(String type, String name, String tv, int ep) {
        this.init(type, name, tv);
        this.ep = ep;
        Printer();
    }

    public void Printer() {
        System.out.println(this.type);
        System.out.println(this.ep);
        System.out.println(this.name);
        System.out.println(this.tv);
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
