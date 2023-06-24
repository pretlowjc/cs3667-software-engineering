/**
 * HalfDollar.java.
 * 
 * @author Jake B., Justin P., Matt N., Reis G.
 * @version 2/8/21
 *
 */
public class HalfDollar extends Coin {

    /**
     * Constructor for USD half dollar.
     */
    public HalfDollar() {
        super(0.5);
        countryCode = "USD";
    } 
  
    /**
     * Prints out half dollar unique smelting method.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName()
            + " with 91.67% Cu and 8.33% Ni...completed.");
    }
}
