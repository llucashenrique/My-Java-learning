package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Team;

public class TestPlayer02 {
    public static void main(String[] args) {
        Player player1 = new Player("Lucas");
        Player player2 = new Player("Jose");


        Player[] players = {player1,player2};

        Team team = new Team("Santos",players);

        player1.setTeam(team);

        player1.printer();

    }
}
