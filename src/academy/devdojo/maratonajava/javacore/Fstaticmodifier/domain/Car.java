package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private Double maximumSpeed;

    private static double limitSpeed = 250;

    public Car(String name, Double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public void printer() {
        System.out.println("-------------");
        System.out.println("Name: " + this.name);
        System.out.println("Maximum speed: " + this.maximumSpeed);
        System.out.println("Limited speed: " + Car.limitSpeed);
    }

    public static void setLimitSpeed(double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }

    public static double getLimitSpeed() {
        return Car.limitSpeed;
    }

    public String getNome() {
        return this.name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public Double getMaximumSpeed() {
        return this.maximumSpeed;
    }

    public void setMaximumSpeed(Double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }


}
