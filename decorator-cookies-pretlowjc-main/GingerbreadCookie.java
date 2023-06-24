/**
 * GingerbreadCookie.java
 *
 * Gingerbread cookie abstraction.
 *
 * @author Justin Pretlow
 * @version Summer 2021
 *
 */

public class GingerbreadCookie extends Cookie {
    private int calories;
    private double cost;

    /**
       Constructor.
       Gingerbread Cookie knows its attribute values.
    */
    public GingerbreadCookie() {
	super("Gingerbread");
	calories = 101;
	cost = 0.50;
    }

    /**
       Determines number of calories in cookie.

       @return number of calories in cookie (int)
    */
    public int calories() { return calories; }
 
    /**
       Determines cost of cookie.

       @return cost of cookie (double)
    */
    public double cost() { return cost; }
 
    /**
       Concise string of object attribute values.

       @return object attribute values string-ified (String)
    */
    public String toString() {
	return "[" 
	    + super.getDescription() + "," 
	    + calories + "," 
	    + "$ " + cost 
	    + "]";
    }

    /**
     * This is the method that tests if a cookie has nuts.
     * 
     * @return boolean that states true or false for nuts or none.
     */
    public boolean hasNuts() {
       boolean nuts;

       if (getDescription().equals(", Pecans")) {
          nuts = true;
       }
       else {
          nuts = false;
       }
       return nuts;
    }

}
