package academy.devdojo.maratonajava.javacore.Ebootblocks.test;

import academy.devdojo.maratonajava.javacore.Ebootblocks.domain.Anime;

public class TestAnime {
    public static void main(String[] args) {
        Anime anime = new Anime();

        System.out.println(anime.getName());

        for (int ep : anime.getEp()) {
            System.out.print(ep + " ");
        }
    }
}
