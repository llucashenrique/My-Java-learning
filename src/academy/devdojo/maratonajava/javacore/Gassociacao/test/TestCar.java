package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Car;

public class TestCar {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("Ford", "Mustang", 2024),
                new Car("mercedes-benz", "cla 300", 2023),
                new Car("Porsche", "911 Turbo", 2022)
        };

        System.out.println("Which is brand of car that have a year 2024? ");
        for (Car car : cars) {
            if (car.getYear() == 2022) {
                System.out.println("Name of car that have a brand of year is: " + car.getBrand());
                break;
            }
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Which is the model of car of brand Mustang? ");
        for (Car car : cars) {
            if (car.getBrand().equals("Ford")) {
                System.out.println("The model of the brand Mustang is: " + car.getModel());
                break;
            }
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("In what year was the Porsche model manufactured? ");
        for (Car car : cars) {
            if (car.getModel().equals("911 Turbo")) {
                System.out.println("The year was " + car.getYear());
                break;
            }
        }
    }
}
