package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio;

public class Seminar {
    private String title;

    private Student[] student;

    private Local local;

    private Teacher2[] teacher2s;


    public Seminar(String tille) {
        this.title = tille;
    }

    public Seminar(String title, Student[] student, Local local, Teacher2[] teacher2s) {
        this.title = title;
        this.student = student;
        this.local = local;
        this.teacher2s = teacher2s;
    }

    public void printer() {
        if (this.student == null) return;
        System.out.println("## Students ##");
        for (Student student1 : student) {
            System.out.println("Students: " + student1.getName() + " ");
            break;
        }
        System.out.println("## Teachers ##");
        if (this.teacher2s == null) return;
        for (Teacher2 teacher2 : teacher2s) {
            System.out.println("Name teachers " + teacher2.getName() + " ");
            System.out.println("Specialties: " + teacher2.getSpecialty() + " ");
        }
        System.out.println("Local: " + local.getLocal() + " ");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
