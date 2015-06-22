package model;

/**
 * Created by riachu on 6/19/15.
 */
public class Player {

    private int credit;
    private String name;
    private Space location;
    private int id;

    public Player(String name, int credit, int id) throws IllegalArgumentException {
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

    public int getId() {
        return id;
    }

    public Space getLocation() {
        return location;
    }

    public String toString() {
        return String.format("ID: %d Name: %-16s Location: %-25s Credit: %6d", id, name, location.getName(), credit);
    }
}
