/**
 * Nickel.java.
 * 
 * @author Jake B., Justin P., Matt N., Reis G.
 * @version 2/8/21
 *
 */
public class Nickel extends Coin {
    
    /**
     * Constructor for USD Nickel.
     */
    public Nickel() {
        super(0.05);
        countryCode = "USD";
    }
    
    /**
     * Prints out unique smelting method for USD Nickel.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() 
            + " with 75% Cu and 25% Ni...completed.");
    }
}
