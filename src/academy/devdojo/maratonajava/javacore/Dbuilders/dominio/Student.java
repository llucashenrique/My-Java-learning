package academy.devdojo.maratonajava.javacore.Dbuilders.dominio;

public class Student {

    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void Printer(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(course);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
