package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio;

public class Teacher2 {
    private String name;
    private String specialty;

    private Seminar[] seminar;

    public Teacher2(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher2(Seminar[] seminar) {
        this.seminar = seminar;
    }

    public void printer(){
        System.out.println("Registered Seminars");
        if (this.seminar == null) return;
        for (Seminar seminar1 : seminar) {
            System.out.println("Seminars: "+ seminar1.getTitle());
        }
    }

    public Seminar[] getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar[] seminar) {
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
