package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Counter {
    private static double counter;
    private static double increase;

    public Counter(double counter, double increase) {
        Counter.counter = counter;
        Counter.increase = increase;
    }

    public void Printer() {
        System.out.println(Counter.counter);
        System.out.println(Counter.increase + Counter.counter);
    }

    public static void setCounter(double counter) {
        Counter.counter = counter;
    }

    public static void setIncrease(double increase) {
        Counter.increase = increase;
    }
}
