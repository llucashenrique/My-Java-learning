package academy.devdojo.maratonajava.javacore.Aintrodutionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrodutionclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.sexo = 'm';
        estudante.name = "lucas";
        estudante.age = 22;

        System.out.println(estudante.sexo);
        System.out.println(estudante.name);
        System.out.println(estudante.age);


    }
}
