import model.AddNewPlayerCommand;
import model.Board;

import java.util.Scanner;

/**
 * Created by riachu on 6/22/15.
 */
public class Monopoly {

    private final int STARTING_CREDIT = 30000;

    // Instance variable
    Board board;

    public Monopoly() {
        this.board = new Board();
    }

    private void addPlayers() {
        Scanner input = new Scanner(System.in);

        String name = "";
        int startingCredit = 0;

        System.out.println();
        System.out.println("You will now add players to the board. Press enter to continue.");
        input.nextLine();

        while (true) {
            System.out.println();
            System.out.print("Enter new Player name: ");
            name = input.nextLine();
//            System.out.print("Starting credit: ");
//            startingCredit = Integer.parseInt(input.nextLine());
            (new AddNewPlayerCommand(board, name, STARTING_CREDIT)).execute();
            System.out.print("Add more players? [Y/N]: ");
            String respond = input.nextLine();
            System.out.println();
            if (respond.charAt(0) == 'N' || respond.charAt(0) == 'n') {
                break;
            }
        }
    }

    public Board getBoard() {
        return board;
    }

    public static void main(String[] args) {
        Monopoly monopoly = new Monopoly();
        monopoly.addPlayers();

        System.out.println(monopoly.getBoard());
        System.out.println(monopoly.getBoard().showPlayers());
    }

}
