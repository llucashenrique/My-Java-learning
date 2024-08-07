package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

import java.util.Scanner;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your favorite type anime? ");
        anime.setType(sc.next());

        System.out.println("How many episodes of your favorite anime are there? ");
        anime.setEp(sc.nextInt());

        System.out.println("Which name of your favorite anime? ");
        anime.setName(sc.next());

        System.out.println("Which TV you used to watch your anime?");
        anime.setTv(sc.next());


        anime.init(anime.getType(), anime.getTv(), anime.getName(), anime.getEp());
    }
}
