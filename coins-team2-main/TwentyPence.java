/**
 * Twenty Pence coin class.
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
public class TwentyPence extends Coin {
    /**
     * Constructor.
     */
    public TwentyPence() {
        super(0.2);
        countryCode = "GBP";
    }

    /**
     * Smelting method.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() 
            + " with 84% Cu and 16% Ni...completed.");
    }
}
