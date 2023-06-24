/**
 * Concrete CoinMint facotry for US Currency.
 * 
 * @author Jake B., Justin P., Matt N., Reis G.
 * @version 2/8/21
 *
 */
public class USDCoinMint extends CoinMint {
    private volatile static USDCoinMint uniqueInstance;

    /**
     * Empty constructor.
     */
    private USDCoinMint() { }

    /**
     * Double check lock singleton for USDCoinMint.
     * 
     * @return uniqueInstance - singleton
     */
    public static USDCoinMint getInstance() {
        if (uniqueInstance == null) {
            synchronized (USDCoinMint.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new USDCoinMint();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * Creates a coin with the respective country code and denomination.
     * 
     * @param denom a double representation of the denomination of the coin
     * @return a Coin reference to the respective coin based on denomination
     */
    public Coin createCoin(double denom) {
        String denomS = String.valueOf(denom);
        switch(denomS) {
            case "1.0":
                return new Dollar();
            
            case "0.5":
                return new HalfDollar();

            case "0.25":
                return new Quarter();

            case "0.1":
                return new Dime();

            case "0.05":
                return new Nickel();

            case "0.01":
                return new Penny();

            default:
                return Coin.NULL;
        }
    }
}
