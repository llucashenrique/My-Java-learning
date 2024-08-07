package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.test;

import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Seminar;
import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Student;
import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Teacher2;

public class TestUniversity {
    public static void main(String[] args) {
        Local local = new Local("Rua Dr gama Rodrigues, 101");
        Student student1 = new Student("Lucas", 21);
        Student student2 = new Student("Joao", 22);

        Teacher2 teacher1 = new Teacher2("Flavio", "engineer");
        Teacher2 teacher2 = new Teacher2("Willian", "Teacher");

        Student[] students = {student1, student2};
        Teacher2[] teacher2s = {teacher1, teacher2};

        Seminar seminar = new Seminar( "Master's Degree",students, local, teacher2s);

        Seminar[] seminars = {seminar};

        teacher1.setSeminar(seminars);

        teacher1.printer();
        seminar.printer();
    }
}
