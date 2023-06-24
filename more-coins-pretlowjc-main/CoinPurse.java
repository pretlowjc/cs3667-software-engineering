import java.util.ArrayList;
import java.util.Iterator;

public class CoinPurse {
    private ArrayList<Coin> coins;

    public CoinPurse() {
	    coins = new ArrayList<Coin>();
    }
    public int size() { return coins.size(); }
    public void add(Coin c) {
	coins.add(c);
    }
    public void fill() {
	    CoinFactory[] factories = new CoinFactory[4];
	    factories[0] = UsdCoinFactory.getInstance();
	    factories[1] = GbpCoinFactory.getInstance();
	    factories[2] = CadCoinFactory.getInstance();
	    factories[3] = EurCoinFactory.getInstance();

	    double[] coinValues = {5.00, 2.00, 1.00, 0.50, 0.25, 0.20, 0.10, 0.05, 0.02, 0.01 };
	    int numIterations = 30 + Randomizer.getInstance().nextInt(30); // something between 30-60 attempts

	    for (int i=0; i < numIterations; i++) {
	        int f = Randomizer.getInstance().nextInt(factories.length);
	        int v = Randomizer.getInstance().nextInt(coinValues.length);
		Coin c = factories[f].makeCoin(coinValues[v]); // "bad" coin value for a factory returns a NULL coin
		this.add(c);
		System.out.println("****** Added (" + c + ") to coin purse.\n");
	    }
	
    }

    Iterator<Coin> iterator() {
	    return new CoinPurseIterator();
    }

    public class CoinPurseIterator implements Iterator<Coin> {
	    private int currIndex = -1;
	    public boolean hasNext() {
	        return (currIndex+1) < coins.size();
	    }
	    public Coin next() {
	        return coins.get(++currIndex);
	    }
    }
}
