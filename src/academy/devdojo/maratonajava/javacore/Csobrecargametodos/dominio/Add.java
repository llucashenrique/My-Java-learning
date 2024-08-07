package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Add {

    private int num1;
    private int num2;

    private double num3;
    private double num4;

    public void init (int num1, int num2){
        Printer();
    }

    public void init(int num1, int num2, double num3, double num4 ){
        this.init(num1, num2);
        this.num3 = num3;
        this.num4 = num4;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public void Printer(){
        System.out.println(num1 + num2);
        System.out.println(num3 + num4);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
