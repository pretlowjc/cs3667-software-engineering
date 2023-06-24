/**
 * Five Pound coin class.
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
public class FivePound extends Coin {
    /**
     * Constructor.
     */
    public FivePound() {
        super(5.0);
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
