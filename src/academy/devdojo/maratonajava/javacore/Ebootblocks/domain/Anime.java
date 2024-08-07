package academy.devdojo.maratonajava.javacore.Ebootblocks.domain;

public class Anime {
    private String name;
    private int[] ep;

    //inicializando meu arrays
    {
        ep = new int[100];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
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
