package academy.devdojo.maratonajava.javacore.Fstaticmodifier.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Car;

public class TestCar {
    public static void main(String[] args) {

        Car car2 = new Car("Porsche", 300.0);
        Car car3 = new Car("Mercedes-Benz", 290.0);
        Car car = new Car("BMW", 280.0);

        Car.setLimitSpeed(180);

        car.printer();
        car2.printer();
        car3.printer();
    }
}
