package academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] ep;

    //inicializando meu arrays static
    static {
        System.out.println("inside");
        ep = new int[100];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i + 1;
        }
    }

    static {
        System.out.println("inside2");
        ep = new int[100];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i + 1;
        }
    }

    {
        System.out.println("inside bloc not static");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int i : Anime.ep) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEp() {
        return ep;
    }
}
