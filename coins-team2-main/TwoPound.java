/**
 * Two Pound coin class.
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
public class TwoPound extends Coin {
    /**
     * Constructor.
     */
    public TwoPound() {
        super(2.0);
        countryCode = "GBP";
    }

    /**
     * Smelting method.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName()
            + " with 76% Cu and 20% Zi and 4% Ni in the outer ring and 75%" 
            + " Cu and 25% Ni in the inner ring...completed.");
    }
}
