package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio;

public class Student {
    private String name;
    private int age;

    private Seminar seminar;

    private Teacher2[] teacher2;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public Teacher2[] getTeacher2() {
        return teacher2;
    }

    public void setTeacher2(Teacher2[] teacher2) {
        this.teacher2 = teacher2;
    }
}
