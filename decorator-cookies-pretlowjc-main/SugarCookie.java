/**
 * SugarCookie.java
 *
 * Sugar cookie abstraction.
 *
 * @author Jay Fenwick
 * @version Summer 2020
 *
 * COPYRIGHT (C) 2020 Jay Fenwick. All Rights Reserved.
 * Rights granted to AppState CS students to copy/modify for educational 
 * purposes.
 */

/**
 * SugarCookie is a realization of the cookie abstraction.
 *
 * @author Jay Fenwick
 * @version Summer 2020
 */

public class SugarCookie extends Cookie {
    private int calories;
    private double cost;

    /**
       Constructor.

       SugarCookie knows its attribute values.
    */
    public SugarCookie() {
	super("Sugar");
	calories = 315;
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

