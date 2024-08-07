package academy.devdojo.maratonajava.introduction;

public class Class08Arraysmultimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2, 3};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3, 5, 9}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
