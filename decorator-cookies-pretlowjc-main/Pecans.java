/**
 * This is the topping pecans.
 * 
 * @author Justin Pretlow
 * @version Summer 2021
 */

public class Pecans extends ToppingDecorator {
    private int calories;
    private double cost;

    /**
     * Constructor.
     * 
     * @param cookie this is referencing the cookie.
     */
    public Pecans(Cookie cookie) {
        super("Pecans");
        this.cookie = cookie;
        calories = 170;
        cost = .50;
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
            + cookie.toString() + ",Pecans," 
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
        return cookie.getDescription() + ", Pecans";
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
