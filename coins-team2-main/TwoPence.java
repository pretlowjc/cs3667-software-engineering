/**
 * Two Pence coin class.
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
public class TwoPence extends Coin {
    /**
     * Constructor.
     */
    public TwoPence() {
        super(0.02);
        countryCode = "GBP";
    }

    /**
     * Smelting method.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() 
            + " with Cu plated steel...completed.");
    }
}
