package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Course {

    private String name;

    private String duration;

    private String level;

    public Course(String name, String duration, String level) {
        this.name = name;
        this.duration = duration;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public String getLevel() {
        return level;
    }
}
