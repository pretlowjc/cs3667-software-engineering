/**
 * Penny.java.
 * 
 * @author Jake B., Justin P., Matt N., Reis G.
 * @version 2/8/21
 *
 */
public class Penny extends Coin {
    
    /**
     * Constructor for USD penny.
     */
    public Penny() {
        super(0.01);
        countryCode = "USD";
    }
    
    /**
     * Prints out unique smelting method for USD penny.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() 
            + " with 2.5% Cu and 97.5% Zn...completed.");
    }
}
