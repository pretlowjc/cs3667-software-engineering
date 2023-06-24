/**
 * Five Pence coin class.
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
public class FivePence extends Coin {
    /**
     * Constructor.
     */
    public FivePence() {
        super(0.05);
        countryCode = "GBP";
    }

    /**
     * Smelting method.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName()
            + " with 75% Cu and 25% Ni...completed.");
    }
}
