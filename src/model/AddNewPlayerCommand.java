package model;

/**
 * Created by riachu on 6/23/15.
 *
 * This Command, when executed, will create a new Player with the given
 * information, add the Player to the given Board, and move the Player to the
 * first space on the Board using MoveToCommand.
 */
public class AddNewPlayerCommand implements Command {

    Board board;
    String name;
    int credit;

    public AddNewPlayerCommand(Board board, String name, int credit) {
        this.board = board;
        this.name = name;
        this.credit = credit;
    }

    public void execute() {
        Player player = new Player(name, credit);
        board.addPlayer(player);
        System.out.println(String.format("New Player %s added.", player.getName()));
        (new MoveToCommand(player, board.getSpaces()[0])).execute();
    }

}
