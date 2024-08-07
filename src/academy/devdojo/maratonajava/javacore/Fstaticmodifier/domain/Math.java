package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Math {

    private static double add;
    private static double subtract;
    private static double multiplication;
    private static double division;


    public void Printer(){
        System.out.println(Math.add);
        System.out.println(Math.subtract);
        System.out.println(Math.multiplication);
        System.out.println(Math.division);
    }

    public static void setAdd(double add, double add2) {
        Math.add = add + add2;
    }

    public static void setSubtract(double subtract, double subtract2) {
        Math.subtract = subtract - subtract2;
    }

    public static void setMultiplication(double multiplication, double multiplication2) {
        Math.multiplication = multiplication * multiplication2;
    }

    public static void setDivision(double division, double division2) {
        Math.division = division / division2;
    }
}
