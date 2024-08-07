package academy.devdojo.maratonajava.javacore.Aintrodutionclasses.dominio;

import java.util.Arrays;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];
        int[] resposta = new int[15];

        System.out.println("Preencha o vetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o valor para A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Preencha o vetor B:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o valor para B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        scanner.close();

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < 15; i++) {
            resposta[i] = A[i] + B[i];
        }
    }
}