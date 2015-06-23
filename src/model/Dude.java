package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by riachu on 6/23/15.
 */
class Dude {

    private String name;
    private int credit;
    private Set<DistrictSpace> property;

    public Dude(String name, int credit) {
        this.name = name;
        this.credit = credit;
        property = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addCredit(int amount) {
        credit += amount;
    }

    public void subtractCredit(int amount) {
        credit -= amount;
    }

    public int getCredit() {
        return credit;
    }

    public void addProperty(DistrictSpace district) {
        if (!property.contains(district)) {
            property.add(district);
        }
    }

    public void removeProperty(DistrictSpace district) {
        if (property.contains(district)) {
            property.remove(district);
        }
    }

    public Set<DistrictSpace> getProperty() {
        return property;
    }
}
