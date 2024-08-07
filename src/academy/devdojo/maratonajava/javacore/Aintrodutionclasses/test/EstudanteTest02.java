package academy.devdojo.maratonajava.javacore.Aintrodutionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrodutionclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Maria";
        estudante2.idade = 25;
        estudante2.sex = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sex);

        System.out.println("-----------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sex);
    }
}
