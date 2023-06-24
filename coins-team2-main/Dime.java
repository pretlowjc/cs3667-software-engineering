/**
 * Dime.java.
 * 
 * @author Jake B., Justin P., Matt N., Reis G.
 * @version 2/8/21
 *
 */
public class Dime extends Coin {

    /**
     * Constructor for USD Dime.
     */
    public Dime() {
        super(0.1);
        countryCode = "USD";
    }

    /**
     * Prints out unique smelting method for dimes.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() 
            + " with 91.67% Cu and 8.33% Ni...completed.");
    }
}
