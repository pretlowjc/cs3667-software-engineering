/**
 * Ten Pence coin class.
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
public class TenPence extends Coin {
    /**
     * Constructor.
     */
    public TenPence() {
        super(0.1);
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
