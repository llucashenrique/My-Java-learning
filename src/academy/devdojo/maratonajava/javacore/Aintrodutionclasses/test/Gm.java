package academy.devdojo.maratonajava.javacore.Aintrodutionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrodutionclasses.dominio.Car;

public class Gm {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();

        car.manufacturer = "Ford";
        car.name = "Mustang ";
        car.model = "GT ";
        car.age = 1950;


        car1.manufacturer = "Ferrari";
        car1.name = "SF-90 ";
        car1.model = "Stradale XX ";
        car1.age = 2024;

        car1 = car;

        System.out.println("CAR ONE");
        System.out.println(car.manufacturer);
        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.age);

        System.out.println("==================");

        System.out.println("CAR TWO");
        System.out.println(car1.manufacturer);
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.age);

    }
}