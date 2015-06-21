package model;

/**
 * Created by riachu on 6/19/15.
 */
public class Board {

    private Space[] spaces;

    public Board() {
        initializeSpaces();
    }

    /**
     * Loads and add the Spaces to the Space array
     */
    private void initializeSpaces() {
        spaces = new Space[41];
        spaces[0] = new SalarySpace();
        spaces[1] = new DistrictSpace("Summergate", 600, 20);
        spaces[2] = new DistrictSpace("Stoneside", 600, 20);
    }

    /**
     * Returns a String containing a list of all Spaces on this Board.
     * @return a String containing a list of all Spaces on this Board.
     */
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < spaces.length; i++) {
            string.append("[");
            string.append(i);
            string.append("]: ");
            string.append(spaces[i]);
            string.append("\n");
        }
        return string.toString();
    }

    public static void main(String[] args) {
        System.out.println((new Board()).toString());
    }

}
