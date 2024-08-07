package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.User;

import java.util.Scanner;

public class TestUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user1 = new User("Alice",25,"SP");
        User user2 = new User("Bruno",30,"RJ");
        User user3 = new User("Carla",22,"BH");

        User[] users = {user1,user2,user3};

        System.out.println("Which is a name of user that live in RJ? ");
        for (User user : users) {
            if (user.getCity().equals("RJ")){
                System.out.println("The user that live in RJ is: "+user.getName());
                break;
            }
        }

        System.out.println("---------------------------------------------");

        System.out.println("What's age of Carla? ");
        for (User user : users) {
            if (user.getName().equals("Carla")){
                System.out.println("The age of Carla is: "+user.getAge());
                break;
            }
        }

        System.out.println("---------------------------------------------");


        System.out.println("Which city live Alice? ");
        for (User user : users) {
            if (user.getName().equals("Alice")){
                System.out.println("The city that Alive live is: "+user.getCity());
                break;
            }
        }
    }
}
