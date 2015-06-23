package model;

/**
 * Created by riachu on 6/19/15.
 */
class Player extends Dude {

    private Space location;

    public Player(String name, int credit) throws IllegalArgumentException {
        super(name, credit);
        if (name.length() > 16) {
            throw new IllegalArgumentException("Please limit Player names to 16 characters.");
        }
    }

    public void setLocation(Space location) {
        this.location = location;
    }

    public Space getLocation() {
        return location;
    }

    public String toString() {
        String localName;
        if (location == null) {
            localName = "UNDEFINED";
        } else {
            localName = location.getName();
        }
        return String.format("Name: %-16s Location: %-25s Credit: %6d", super.getName(), localName, super.getCredit());
    }
}
