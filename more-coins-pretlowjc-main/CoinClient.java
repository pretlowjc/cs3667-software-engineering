import java.util.Currency;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Iterator;

public class CoinClient {
    private static CoinFactory processCommandLine(String[] args) {
	CoinFactory cf = null;
	if (args.length == 1 && "USD".equals(args[0])) {
	    cf = UsdCoinFactory.getInstance();
	}
	else if (args.length == 1 && "GBP".equals(args[0])) {
	    cf = GbpCoinFactory.getInstance();
	}
	else if (args.length == 1 && "CAD".equals(args[0])) {
	    cf = CadCoinFactory.getInstance();
	}
	else if (args.length == 1 && "EUR".equals(args[0])) {
	    cf = EurCoinFactory.getInstance();
	}
	else {
	    System.out.println("\nProblem with command line coin factory argument.");
	    System.out.println("Possible coin factories include: USD, GBP, CAD, EUR");
	    cf = UsdCoinFactory.getInstance();
	}
	System.out.println("Using " + cf.getName());
	System.out.println();
	return cf;
    }
    public static void main(String[] args) {
	CoinFactory cf = processCommandLine(args);
	CoinPurse purse = new CoinPurse();
	Scanner keyboard = new Scanner(System.in);
	double val = 1.0;
	while (val > 0.0) {
	    System.out.print("Enter coin denomination (0.25 = a quarter, 0 to quit): ");
	    try {
		val = keyboard.nextDouble();
	    } catch (Exception e) {
		String msg = e.getMessage();
		System.out.println("Error reading your entry" 
				   + (msg==null?"":msg));
		keyboard.nextLine();
		continue;
	    }
	    Coin c = cf.makeCoin(val);
	    System.out.println(c);
	    purse.add(c);
	}

	/*************************************** *************/
	/*********************** VISITOR SECTION *************/
	/*************************************** *************/
	purse.fill(); // put a bunch more random coins in the purse
	System.out.println("\nCoin Purse contains " + purse.size() + " coins.");

	// Create concrete visitor objects
	CoinVisitor visitor1 = new Collector();
	CoinVisitor visitor2 = new Collector();

	Iterator purseTraverser = purse.iterator();
	while (purseTraverser.hasNext()) {
	    Coin c = (Coin) purseTraverser.next();
	    c.accept(visitor1);
	    c.accept(visitor2);
	}
	// When done, have each visitor "report"
	System.out.println(visitor1.report());
	System.out.println(visitor2.report());

	
    }
    private static void currency(String args0) {
	Currency c = Currency.getInstance(args0);
	System.out.println("Display name: <" + c.getDisplayName() + ">");
	System.out.println("Numeric code: <" + c.getNumericCode() + ">");
	System.out.println("Symbol: <" 
			   + c.getSymbol(getLocale(c.getCurrencyCode()))
			   + ">");
    }
    private static Locale getLocale(String code) {
	if ("USD".equals(code)) return Locale.US;
	else if ("GBP".equals(code)) return Locale.UK;
	else if ("EUR".equals(code)) return Locale.FRANCE;
	else return Locale.getDefault();
    }
}


