package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;


public class Employee {

    private String name;
    private int age;
    private int[] salarys;
    private double media;

    public void Printer(Employee employee) {
       if (salarys == null){
           return;
       }

        System.out.println(this.name);
        System.out.println(this.age);

        for (int i : salarys) {
            System.out.println(i);

        }
    }

    public void Printeraverage(Employee employee) {
        if (salarys == null){
            return;
        }

        double sum = 0;

        for (int i : salarys) {
            sum += i;
            media = sum / salarys.length;
        }

        System.out.println("This is the sum: " + sum);
        System.out.println("This is average: " + media);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalarys(int[] salarys) {
        this.salarys = salarys;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getSalarys() {
        return salarys;
    }

    public double getMedia() {
        return media;
    }
}