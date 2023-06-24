/**
 * Dollar.java.
 * 
 * @author Jake B., Justin P., Matt N., Reis G.
 * @version 2/8/21
 *
 */
public class Dollar extends Coin {

    /**
     * Constructor for USD Dollar.
     */
    public Dollar() {
        super(1.0);
        countryCode = "USD";
    }
    
    /**
     * Prints out unique smelting method for dollar coins.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() 
            + " with 88.5% Cu, 6% Zn, 3.5% Mn, and 2% Ni...completed.");
    }
}
