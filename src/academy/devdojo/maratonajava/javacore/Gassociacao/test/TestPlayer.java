package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Player;

public class TestPlayer {
    public static void main(String[] args) {
        Player player = new Player("lucas");
        Player player2 = new Player("henrique");
        Player player3 = new Player("peres");

        Player[] players = {player, player2, player3};


        for (Player player1 : players) {
            player1.printer();
        }
    }
}
