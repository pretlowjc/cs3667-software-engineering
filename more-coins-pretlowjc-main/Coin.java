import java.util.Currency;
import java.util.Locale;
import java.text.DecimalFormat;


abstract class Coin {
    abstract void accept(CoinVisitor v);
    private double multiplier;
    private Currency currency;
    private Smelter smelter;
    Coin(String code, double m) { 
	    multiplier = m; 
	    currency = Currency.getInstance(code);
    }
    public abstract Coin imprint(Coin c);
    public Smelter getSmelter() { return smelter; }
    public void setSmelter(Smelter s) { smelter = s; }
    public String getCurrencyCode() {
	    return currency.getCurrencyCode();  // USD, EUR, etc.
    }
    private Locale getLocale(String code) {
	    if ("USD".equals(code)) return Locale.US;
	    else if ("GBP".equals(code)) return Locale.UK;
	    else if ("EUR".equals(code)) return Locale.FRANCE;
	    else if ("CAD".equals(code)) return Locale.CANADA;
	    else return Locale.getDefault();
    }
    public String stringValue() {
	    DecimalFormat df = new DecimalFormat();
	    df.setMaximumFractionDigits(2);
	    df.setMinimumFractionDigits(2);
	    return df.format(multiplier);
    }
    public double value() {
	    return multiplier;
    }
    public String toString() {
	    String symbol = currency.getSymbol(getLocale(currency.getCurrencyCode()));
	    String className = this.getClass().getName();
	    return "(" + className + ")" + symbol + stringValue();
    }

    static class NullCoin extends Coin {
	private NullCoin() { super("USD", 0.0); }
	public String toString() { return ""; }
	public void accept(CoinVisitor v) { v.visit(this); }
	public Coin imprint(Coin c) { return this; }
    }
    public static final Coin NULL = new NullCoin();
}




abstract class CoinFactory {
    String name;
    public CoinFactory(String name) {
	    this.name = name;
    }
    protected boolean eq(double a, double b) {
	    // Because doubles don't == nicely
	    return (Math.abs(a-b) < 0.00001);
    }
    public String getName() { return name; }
    


    // Factory method! (used by makeCoin public method)
    public abstract Coin manufactureCoin(double type);

    // Coin mutators; concrete coins know how to do these specific to themselves.
    public abstract Coin smelt(Coin c);
    public abstract Coin imprint(Coin c);


    // Common part of making coins
   	public final Coin makeCoin(double type) {
    
	// Use mint-specific manufacture to get "raw" coin, then finish processing of it
	Coin c = manufactureCoin(type); 
	if (c != Coin.NULL) {
	    // smelting and imprinting processes are specific to coin type
	    c = smelt(c);
	    c = imprint(c);

	    // common coin production processes
	    if (! (inspect(c) && smooth(c) && polish(c))) {
		        System.out.println("Failed to manufacture coin.");
		        c = Coin.NULL;
	        }
	    }
	    return c;
    }

    private final boolean smooth(Coin c) {
	    System.out.print("Smoothing " + c.getClass().getName() + "...");
	    if (Randomizer.getInstance().oneIn(1000)) {
	        System.out.println("failed.");	   
	        return false;
	    }
	    else {
	        System.out.println("completed.");
	        return true;
	    }
    }
    private final boolean inspect(Coin c) {
	    System.out.print("Inspecting " + c.getClass().getName() + "...");
	    if (Randomizer.getInstance().oneIn(1000)) {
	        System.out.println("failed.");	   
	        return false;
	    }
	    else {
	        System.out.println("completed.");
	        return true;
	    }
    }
    private final boolean polish(Coin c) {
	    System.out.print("Polishing " + c.getClass().getName() + "...");
	    if (Randomizer.getInstance().oneIn(5)) {
	        System.out.println("failed.");	   
	        return false;
	    }
	    else {
	        System.out.println("completed.");
	        return true;
	    }
    }
  
	protected void hook() {
	
	}
}

