package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.test;

import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Company;
import academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio.Employe;

public class TestCompany {
    public static void main(String[] args) {
        Employe employe1 =  new Employe("Lucas","Tech Lead",2000);
        Employe employe2 =  new Employe("Rodrigo","Senior Engineer",2000);
        Employe employe3 =  new Employe("Henrique","Tech Recruiter",2000);

        Company company = new Company("LC Tech");

        employe1.setCompany(company);
        employe2.setCompany(company);
        employe3.setCompany(company);

        employe1.printer();
        employe2.printer();
        employe3.printer();
    }
}
