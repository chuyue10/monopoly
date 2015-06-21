package model;

/**
 * Created by riachu on 6/19/15.
 */
public class Player {

    private int credit;
    private String name;
    private Space location;

    public Player(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }
}
