package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by riachu on 6/22/15.
 */
public class Monopoly {

    private final int STARTING_CREDIT = 30000;

    public Monopoly() {

    }

    private void createGame() {
        Scanner input = new Scanner(System.in);

        List<Player> players = new LinkedList<Player>();

        String name = "";
        int startingCredit = 0;

        System.out.println("Enter players.");
        while (true) {
            System.out.println("Creating player.");
            System.out.print("Player name: ");
            name = input.nextLine();
            System.out.print("Starting credit: ");
            startingCredit = input.nextInt(STARTING_CREDIT);
            Player player = new Player(name, startingCredit, players.size());
            players.add(player);
            System.out.println(player + " has been created.");
            System.out.println("Add more players? [Y/N]: ");
            String respond = input.nextLine();
            if (respond == "Y") {
                break;
            }
        }
        System.out.println("Creating game...");

        Board board = new Board(players);
        System.out.println(board);
        System.out.println(board.getPlayers());
    }

    public static void main(String[] args) {
        Monopoly monopoly = new Monopoly();
        monopoly.createGame();
    }

}
