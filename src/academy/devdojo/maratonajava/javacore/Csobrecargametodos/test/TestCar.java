package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Car;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        System.out.println("What's model of car: ");
        car.setModel(sc.next());

        System.out.println("what's year of car: ");
        car.setYear(sc.next());

        System.out.println("What's color of car: ");
        car.setColor(sc.next());

        car.init(car.getModel(), car.getYear(), car.getColor());

    }
}
