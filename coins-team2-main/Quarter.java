/**
 * Quarter.java.
 * 
 * @author Jake B., Justin P., Matt N., Reis G.
 * @version 2/8/21
 *
 */
public class Quarter extends Coin {

    /**
     * Constructor for USD Quarter.
     */
    public Quarter() {
        super(0.25);
        countryCode = "USD";
    }
    
    /**
     * Prints out unique smelting method for quarters.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() 
            + " with 91.67% Cu and 8.33% Ni...completed.");
    }
}
