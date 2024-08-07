package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Team;

public class TestPlayer03 {
    public static void main(String[] args) {
        Player player1 = new Player("lucas");
        Player player2 = new Player("Joao");
        Player player3 = new Player("Kayo");

        Team team = new Team("Santos");

        Player[] player = {player1, player2, player3};

        player1.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(player);

        System.out.println("---Player---");
        player1.printer();

        System.out.println("---Time---");

        team.printer();
    }
}
