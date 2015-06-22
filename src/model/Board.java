package model;

import java.util.List;

/**
 * Created by riachu on 6/19/15.
 */
public class Board {

    // Instance variables
    private Space[] spaces;
    private List<Player> players;

    public Board(List<Player> players) {
        for (Player p: players) {
            setupPlayer(p);
        }
        initializeSpaces();
    }

    /**
     * Setup a player. 1. Add to List of Player
     *                 2. Put in GO space
     * @param player the player to be added
     */
    public void setupPlayer(Player player) {
        players.add(player);
        spaces[0].addPlayer(player);
    }

    /**
     * Returns a formatted with information of all the Players on the Board.
     * @return
     */
    public String getPlayers() {
        StringBuilder string = new StringBuilder();
        for (Player p: players) {
            string.append(String.format("[%d] %16s %s\n", p.getId(), p.getName(), p.getLocation()));
        }
        return string.toString();
    }

    /**
     * Loads and add the Spaces to the Space array.
     */
    private void initializeSpaces() {
        spaces = new Space[41];

        spaces[0] = new SalarySpace();
        spaces[1] = new DistrictSpace("Summergate", 600, new int[]{20, 100, 200, 400, 800, 1600, 2200, 3000, 5500});
        spaces[2] = new ChanceSpace();
        spaces[3] = new DistrictSpace("Stoneside", 600, new int[]{40, 200, 400, 800, 1600, 2200, 3000,4000, 7000});
        spaces[4] = new TaxSpace();

        spaces[5] = new ConstructionSpace();
        spaces[6] = new DistrictSpace("Westlands", 1000, new int[]{60, 300, 600, 1200, 1800, 2500, 3500, 5000, 7500});
        spaces[7] = new ChanceSpace();
        spaces[8] = new DistrictSpace("Bayview Dock", 1000, new int[]{60, 300, 600, 1200, 1800, 2500, 3500, 5000, 7500});
        spaces[9] = new DistrictSpace("Brightside", 1200, new int[]{80, 400, 800, 1500, 2500, 3500, 4500, 6000, 8500});

        spaces[10] = new PrisonSpace();
        spaces[11] = new DistrictSpace("Old Town", 1400, new int[]{100, 500, 1000, 2000, 3000, 4000, 5000, 6500, 9000});
        spaces[12] = new AuctionSpace();
        spaces[13] = new DistrictSpace("Harbor Heights", 1400, new int[]{100, 500, 1000, 2000, 3000, 4000, 5000, 6500, 9000});
        spaces[14] = new DistrictSpace("Central Quay", 1600, new int[]{120, 600, 1200, 2400, 3500, 4500, 5500, 7000, 9500});

        spaces[15] = new ConstructionSpace();
        spaces[16] = new DistrictSpace("Shine Village", 1800, new int[]{140, 700, 1400, 2800, 3800, 4800, 6000, 7500, 10000});
        spaces[17] = new ChanceSpace();
        spaces[18] = new DistrictSpace("East Bank", 1800, new int[]{140, 700, 1400, 2800, 3800, 4800, 6000, 7500, 10000});
        spaces[19] = new DistrictSpace("Treetop Park", 2000, new int[]{160, 800, 1600, 3000, 4000, 5000, 6000, 8000, 11000});

        spaces[20] = new FreeParkingSpace();
        spaces[21] = new DistrictSpace("Seaview", 2200, new int[]{180, 900, 1800, 3500, 4500, 5500, 6500, 8500, 12000});
        spaces[22] = new ChanceSpace();
        spaces[23] = new DistrictSpace("The Wharf", 2200, new int[]{180, 900, 1800, 3500, 4500, 5500, 6500, 8500, 12000});
        spaces[24] = new DistrictSpace("Middleton", 2400, new int[]{200, 1000, 2000, 3800, 4800, 5800, 6800, 8800, 13500});

        spaces[25] = new ConstructionSpace();
        spaces[26] = new DistrictSpace("New Town", 2600, new int[]{220, 1100, 2200, 4000, 5000, 6000, 7000, 8000, 14000});
        spaces[27] = new DistrictSpace("Silver Harbor", 2600, new int[]{220, 1100, 2200, 4000, 5000, 6000, 7000, 10000, 14000});
        spaces[28] = new ChanceSpace();
        spaces[29] = new DistrictSpace("Central City", 2800, new int[]{240, 1200, 2400, 4200, 5200, 6200, 8200, 10500, 15000});

        spaces[30] = new GotoJailSpaces();
        spaces[31] = new DistrictSpace("Royal Court", 3000, new int[]{260, 1300, 2600, 4400, 5300, 6500, 8500, 11000, 15500});
        spaces[32] = new DistrictSpace("The Marina", 3000, new int[]{260, 1300, 2600, 4400, 5300, 6500, 8500, 11000, 15500});
        spaces[33] = new AuctionSpace();
        spaces[34] = new DistrictSpace("Riverside", 3200, new int[]{280, 1500, 3000, 4500, 5500, 7000, 9000, 12000, 16000});

        spaces[35] = new ConstructionSpace();
        spaces[36] = new ChanceSpace();
        spaces[37] = new DistrictSpace("Fortune Valley", 3500, new int[]{350, 1750, 4500, 5500, 7000, 9000, 11000, 16000, 18000});
        spaces[38] = new TaxSpace();
        spaces[39] = new DistrictSpace("Diamond Hill", 4000, new int[]{500, 3000, 5000, 8000, 10000, 12000, 15000, 18000, 20000});

        spaces[40] = new JailSpace();
    }

    /**
     * Returns a String containing a list of all Spaces on this Board.
     * @return a String containing a list of all Spaces on this Board.
     */
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < spaces.length; i++) {
            string.append("[");
            string.append(String.format("%02d", i));
            string.append("]: ");
            string.append(spaces[i]);
            string.append("\n");
        }
        return string.toString();
    }
}
