import model.Board;
import model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by riachu on 6/22/15.
 */
public class Monopoly {

    private final int STARTING_CREDIT = 30000;

    // Instance variables
    List<Player> players;

    public Monopoly() {
        players = new ArrayList<>();
    }

    private void createGame() {
        Scanner input = new Scanner(System.in);

        String name = "";
        int startingCredit = 0;

        System.out.println("Enter players.");
        while (true) {
            System.out.println("Creating player.");
            System.out.print("Player name: ");
            name = input.nextLine();
            System.out.print("Starting credit: ");
            startingCredit = Integer.parseInt(input.nextLine());
            Player player = new Player(name, startingCredit, players.size());
            players.add(player);
            System.out.println(player);
            System.out.print("Add more players? [Y/N]: ");
            String respond = input.nextLine();
            if (respond.charAt(0) == 'N' || respond.charAt(0) == 'n') {
                break;
            }
        }

        System.out.println("Creating game...\n");
        Board board = new Board(players);

        System.out.println("Populating board...");

        System.out.println("Placing players into GO Space...");
        for (Player p: players) {
            (new MoveCommand(p, board.getSpaces()[0])).execute();
        }

        System.out.println();
        System.out.println(board);
        System.out.println(showPlayers());
    }

    /**
     * Returns a formatted with information of all the Players on the Board.
     * @return
     */
    public String showPlayers() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < players.size(); i++) {
            string.append(String.format("[%d]: ", i));
            string.append(players.get(i).toString());
            string.append("\n");
        }
        return string.toString();
    }

    public static void main(String[] args) {
        Monopoly monopoly = new Monopoly();
        monopoly.createGame();
    }

}
