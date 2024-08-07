package academy.devdojo.maratonajava.javacore.Fstaticmodifier.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Converter;

import java.util.Scanner;

public class TestConverter {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many km do you want converter to MILES: ");
        Converter.setConverterKm(sc.nextDouble());

        System.out.println("How many miles do you want converter to KM: ");
        Converter.setConverterMiles(sc.nextDouble());

        System.out.println("How many many celsius do want converter to FAHRENHEIT: ");
        Converter.setConverterCelsius(sc.nextDouble());

        System.out.println("How many many fahrenheit do want converter to CELSIUS: ");
        Converter.setConverterFahrenheit(sc.nextDouble());

        Converter.converting(Converter.getConverterKm());

        Converter.converting2(Converter.getConverterMiles());

        Converter.converting3(Converter.getConverterCelsius());

        Converter.converting4(Converter.getConverterFahrenheit());

        converter.Printer();
    }
}
