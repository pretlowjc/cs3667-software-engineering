/**
 * Pence coin class.
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
public class Pence extends Coin {
    /**
     * Constructor.
     */
    public Pence() {
        super(0.01);
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
