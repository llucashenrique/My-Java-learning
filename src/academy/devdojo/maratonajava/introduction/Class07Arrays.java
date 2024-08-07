package academy.devdojo.maratonajava.introduction;

public class Class07Arrays {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        //char '\u0000'  '  '
        // boolean false
        // String null

        String[] names = new String[5];
        names[0] = "Lucas";
        names[1] = "Henrique";
        names[2] = "Peres";
        names[3] = "Lino";
        names[4] = "My full name";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
