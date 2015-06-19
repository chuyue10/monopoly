package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by riachu on 6/19/15.
 */

abstract class Space {

    private HashSet<Player> players;

    /**
     * Returns the set of all players that are in this space.
     * @return Set of Players in this Space
     */
    public Set<Player> getPlayers() {
        return players;
    }

    /**
     * Adds a Player to this Space.
     * @param player
     */
    public void addPlayer(Player player) {
        players.add(player);
        onEnter(player);
    }

    /**
     * Removes a Player from this Space.
     * @param player
     */
    public void removePlayer(Player player) {
        players.remove(player);
    }

    /**
     * This method is ran after a Player has entered the Space. To be
     * implemented by concrete classes.
     * @param player
     */
    abstract void onEnter(Player player);
}
