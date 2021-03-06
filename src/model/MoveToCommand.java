package model;
// TODO IMPLEMENT UNDO

/**
 * Created by riachu on 6/22/15.
 */
public class MoveToCommand implements Command {

    private Player player;
    private Space origin;
    private Space destination;

    public MoveToCommand(Player player, Space destination) {
        this.player = player;
        this.origin = player.getLocation();
        this.destination = destination;
    }

    public void execute() {
        if (origin != null) {
            origin.removePlayer(player);
        }
        destination.addPlayer(player);
        player.setLocation(destination);

        String oriName;
        if (origin == null) {
            oriName = "UNDEFINED";
        } else {
            oriName = origin.getName();
        }
        System.out.println(String.format("Moved %s from %s to %s.", player.getName(), oriName, destination.getName()));
    }

}
