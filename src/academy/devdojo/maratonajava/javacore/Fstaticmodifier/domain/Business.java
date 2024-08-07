package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Business {

    private static double numberOfEmployees;

    private static double setEmployees;
    private static double v;

    public static void setSetEmployees(double setEmployees) {
        Business.setEmployees = setEmployees;
    }

    public double getSetEmployees() {
        if (setEmployees > 0) {
            v = setEmployees - setEmployees;
        }
        return v;
    }
}
