package academy.devdojo.maratonajava.javacore.Gassociacaounidirencional.dominio;

public class Employe {

    private String name;

    private String holdOffice;

    private double salary;

    private Company company;

    public Employe(String name, String holdOffice, double salary) {
        this.name = name;
        this.holdOffice = holdOffice;
        this.salary = salary;
    }

    public void printer(){
        System.out.println(this.name);
        System.out.println(this.holdOffice);
        System.out.println(this.salary);
        if (company != null){
            System.out.println(company.getName());
        }
        System.out.println("-----------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHoldOffice() {
        return holdOffice;
    }

    public void setHoldOffice(String holdOffice) {
        this.holdOffice = holdOffice;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
