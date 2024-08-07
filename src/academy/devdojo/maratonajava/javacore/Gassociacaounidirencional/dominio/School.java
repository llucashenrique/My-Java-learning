package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio;

public class School {
    private String name;

    private Teacher[] teacher;

    public School(String name, Teacher[] teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void printer(){
        System.out.println(this.name);
        if (teacher == null) return;
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }
}
