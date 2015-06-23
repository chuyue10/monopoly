package model;

/**
 * Created by riachu on 6/23/15.
 */
public class GivePropertyCommand implements Command {

    private Dude source;
    private Dude receiver;
    private DistrictSpace property;

    public GivePropertyCommand(DistrictSpace property, Dude reciever) {
        this.source = property.getOwner();
        this.receiver = reciever;
        this.property = property;
    }

    public void execute() {
        if (source != null) {
            source.removeProperty(property);
        }
        property.setOwner(receiver);
        receiver.addProperty(property);
    }

}
