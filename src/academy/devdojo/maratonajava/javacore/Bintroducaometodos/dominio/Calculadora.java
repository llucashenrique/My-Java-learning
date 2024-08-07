package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void soma() {
        System.out.println(10 - 10);
    }

    public void subtraction() {
        System.out.println(21 - 2);
    }

    public void multiplication(double num1, double num2) {
        System.out.println(num1 / num2);
    }

    public double divison(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divison02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void printDivison02(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("there is no division by 0");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void changeNumbers(int numero1, int numero2) {
        numero1 = 0;
        numero2 = 3;
        System.out.println("Inside the domain");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);

    }

    public void somaArray(int[] numbers){
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println(soma);
    }

    public  void somaVarArgs( int... numbers){
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println(soma);
    }
}



