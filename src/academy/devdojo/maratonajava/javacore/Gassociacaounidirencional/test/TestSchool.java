package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.test;

import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.School;
import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Teacher;

public class TestSchool {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Flavio");
        Teacher teacher2 = new Teacher("Lucas");
        Teacher teacher3 = new Teacher("Willian");

        Teacher[] teachers = {teacher1,teacher2,teacher3};

        School school = new School("Genesio",teachers);

        school.printer();

    }
}
