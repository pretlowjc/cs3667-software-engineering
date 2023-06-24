/**
 * This is the topping chocolate chip. 
 * 
 * @author Justin Pretlow
 * @version Summer 2021
 */

public class ChocChip extends ToppingDecorator {
    private int calories;
    private double cost;

    /**
     * Constructor. 
     * 
     * @param cookie this is referencing the cookie.
     */
    public ChocChip(Cookie cookie) {
        super("Chocolate Chip");
        this.cookie = cookie;
        calories = 200;
        cost = .75;
    }

    /**
     * Returns the cost of the topping.
     * 
     * @return cost of topping (double).
     */
    public double cost() {
        return cost;
    }

    /**
     * Returns the number of calories in the topping.
     * 
     * @return calories in topping (int).
     */
    public int calories() {
        return calories;
    }

    /**
     * Concise output of object attributes.
     * 
     * @return object attributes string (String).
     */
    public String toString() {
        return "[" 
            + cookie.toString() + ",Chocolate Chip," 
            + calories + "," 
            + "$ " + cost 
            + "]";
    }
    
    /**
     * Returns object description value.
     * 
     * @return description attribeute value.
     */
    public String getDescription() {
        return cookie.getDescription() + ", Chocolate Chip";
    }

    /**
     * Returns whether or not a cookie has nuts.
     * 
     * @return boolean value
     */
    public boolean hasNuts() {
        return cookie.hasNuts();
    }
}
