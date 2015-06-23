package model;

/**
 * Created by riachu on 6/19/15.
 */
class DistrictSpace extends Space {

    // Instance variables
    int cost;
    int[] rent;
    int house;
    int factory;
    Player owner;

    public DistrictSpace(String name, int cost, int[] rent) {
        super(name + " District");
        this.cost = cost;
        this.rent = rent;
        this.house = 0;
        this.factory = 0;
    }

    @Override
    void onEnter(Player player) {

    }

    public void setOwner(Player newOwner) {
        this.owner = newOwner;
    }

    public void buildHouse(int n) throws IllegalArgumentException {
        if (house + factory + n > 8) {
            throw new IllegalArgumentException(String.format("Building exceed 8 block limit. Current: %d Empty lot: %d", house + factory, 8 - house - factory));
        } else {
            house += n;
        }
    }

    public void demolishHouse(int n) throws IllegalArgumentException {
        if (house - n < 0) {
            throw new IllegalArgumentException(String.format("Cannot remove %d houses. Current: %d", n, house));
        } else {
            house -= n;
        }
    }

    public void addFactory(int n) throws IllegalArgumentException {
        if (house + factory + n > 8) {
            throw new IllegalArgumentException(String.format("Building exceed 8 block limit. Current: %d Empty lot: %d", house + factory, 8 - house - factory));
        } else {
            house += n;
        }
    }

    public void demolishFactory(int n) throws IllegalArgumentException {
        if (factory - n < 0) {
            throw new IllegalArgumentException(String.format("Cannot remove %d houses. Current: %d", n, factory));
        } else {
            factory -= n;
        }
    }

    public int getRent() {
        return rent[house + factory];
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(super.toString());
        string.append(" Cost: ");
        string.append(String.format("%4d", cost));
        string.append(" Rent: ");
        string.append(String.format("%5d", getRent()));
        string.append(String.format("   House: %d", house));
        string.append(String.format("   Factory: %d", factory));
        string.append("   Owner: ");
        if (owner == null) {
            string.append("None");
        } else {
            string.append(owner.getName());
        }
        return string.toString();
    }
}
