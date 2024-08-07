package academy.devdojo.maratonajava.javacore.Dbuilders.test;

import academy.devdojo.maratonajava.javacore.Dbuilders.dominio.Anime;

import java.util.Scanner;

public class AnimeTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anime anime = new Anime("rgeg","fwe","efw",0,"fwew");

        System.out.println("What is your favorite type anime? ");
        anime.setType(sc.next());

        System.out.println("How many episodes of your favorite anime are there? ");
        anime.setEp(sc.nextInt());

        System.out.println("Which name of your favorite anime? ");
        anime.setName(sc.next());

        System.out.println("Which TV you used to watch your anime?");
        anime.setTv(sc.next());

        System.out.println("Which studio do you prefer about anime? ");
        anime.setStudio(sc.next());

        anime.Printer();
    }
}
