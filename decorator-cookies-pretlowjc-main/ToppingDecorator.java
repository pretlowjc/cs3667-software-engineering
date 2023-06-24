/**
 * ToppingDecorator.java
 * 
 * Topping Decorator abstraction.
 * 
 * @author Justin Pretlow
 * @version Summer 2021
 */

 /**
  * Topping decorator is an abstraction of topping objects.
  * 
  * @author Justin Pretlow
  * @version Summer 2021
  */
public abstract class ToppingDecorator extends Cookie {
    Cookie cookie;

    /**
     * Constructor. 
     * 
     * @param d description text.
     */
    public ToppingDecorator(String d) {
        super(d);
    }
    /**
        Returns object description attribute value.

        @return description attribute value.
    */
    public abstract String getDescription();
}
