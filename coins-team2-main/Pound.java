/**
 * Pound coin class.
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
public class Pound extends Coin {
    /**
     * Constructor.
     */
    public Pound() {
        super(1.0);
        countryCode = "GBP";
    }

    /**
     * Smelting method.
     */
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() 
            + " with 70% Cu, 24.5% Zi, and 5.5% Ni...completed.");
    }
}
