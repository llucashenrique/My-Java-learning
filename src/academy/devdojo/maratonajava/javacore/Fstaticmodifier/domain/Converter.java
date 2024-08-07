package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Converter {

    private static double converterKm;

    private static double converterMiles;

    private static double converterCelsius;

    private static double converterFahrenheit;

    private static double result;
    private static double result2;
    private static double result3;
    private static double result4;

    public static void converting(double converterKm) {
        result = converterKm;
        result = result / 1.609;
    }

    public static void converting2(double converterKm) {
        result2 = converterKm;
        result2 = result2 * 1.609;
    }

    public static void converting3(double converterKm) {
        result3 = converterKm;
        result3 = ((result3 * 9 / 5) + 32);
    }

    public static void converting4(double converterKm) {
        result4 = converterKm;
        result4 = ((result4 -32) * 5/9);
    }

    public void Printer() {
        System.out.println("Value in KM: " + Converter.converterKm);
        System.out.println("Converting in MILES: " + result);
        System.out.println("Value in MILES: " + Converter.converterMiles);
        System.out.println("Converting in KM:" + result2);
        System.out.println("Value in Celsius: " + Converter.converterCelsius);
        System.out.println("Converting in FAHRENHEIT: " + result3);
        System.out.println("Value in Fahrenheit: " + Converter.converterFahrenheit);
        System.out.println("Converting in CELSIUS: " + result4);
    }

    public static void setConverterKm(double converterKm) {
        Converter.converterKm = converterKm;
    }

    public static void setConverterMiles(double converterMiles) {
        Converter.converterMiles = converterMiles;
    }

    public static void setConverterCelsius(double converterCelsius) {
        Converter.converterCelsius = converterCelsius;
    }

    public static void setConverterFahrenheit(double converterFahrenheit) {
        Converter.converterFahrenheit = converterFahrenheit;
    }

    public static double getConverterKm() {
        return converterKm;
    }

    public static double getConverterMiles() {
        return converterMiles;
    }

    public static double getConverterCelsius() {
        return converterCelsius;
    }

    public static double getConverterFahrenheit() {
        return converterFahrenheit;
    }
}
