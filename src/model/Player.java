package model;

/**
 * Created by riachu on 6/19/15.
 */
public class Player {

    private int credit;
    private String name;
    private Space location;
    private byte id;

    public Player(String name, int credit, byte id) throws IllegalArgumentException {
        if (name.length() > 16) {
            throw new IllegalArgumentException("Please limit Player names to 16 characters.");
        }
        this.name = name;
        this.credit = credit;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public byte getId() {
        return id;
    }

    public Space getLocation() {
        return location;
    }
}
