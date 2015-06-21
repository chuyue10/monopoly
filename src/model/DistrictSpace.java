package model;

/**
 * Created by riachu on 6/19/15.
 */
public class DistrictSpace extends Space {

    // Instance variables
    int cost;
    int rent;

    public DistrictSpace(String name, int cost, int rent) {
        super(name + " District");
        this.cost = cost;
        this.rent = rent;
    }

    @Override
    void onEnter(Player player) {

    }
}
