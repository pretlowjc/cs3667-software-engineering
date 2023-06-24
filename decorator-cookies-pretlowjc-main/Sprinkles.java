/**
 * This is the topping sprinkles.
 * 
 * @author Justin Pretlow
 * @version Summer 2021
 */

public class Sprinkles extends ToppingDecorator {
    private int calories;
    private double cost;

    /**
     * Constructor.
     * 
     * @param cookie this is referencing the cookie.
     */
    public Sprinkles(Cookie cookie) {
        super("Sprinkles");
        this.cookie = cookie;
        calories = 143;
        cost = 0.40;
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
            + cookie.toString() + ",Sprinkles," 
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
        return cookie.getDescription() + ", Sprinkles";
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

