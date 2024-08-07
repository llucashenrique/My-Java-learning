package academy.devdojo.maratonajava.introduction;

import java.util.Scanner;

public class Class07ForEx2 {
    public static void main(String[] args) {
        double value = 30000;
        for (int parcela = 1; parcela <= value; parcela++) {
            double valuePar = value / parcela;
            if (valuePar < 1000) {
                continue;
            }
            System.out.println("numbers that parcel" + parcela);
        }
    }
}
