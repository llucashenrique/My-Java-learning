package academy.devdojo.maratonajava.javacore.Aintrodutionclasses.test;


import academy.devdojo.maratonajava.javacore.Aintrodutionclasses.dominio.Teacher;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher();

        teacher.age = 35;
        teacher.sexo = 'm';
        teacher.name = "Flavio";

        System.out.println("Name: " + teacher.name + " Age: " + teacher.age + " Sex: " + teacher.sexo);
        System.out.println("Nome: " + teacher1.name + " Sexo: " + teacher1.sexo + " Idade: " + teacher1.age);
    }
}
