
import java.util.Random;

class Randomizer {
    private static Randomizer instance;
    private Random generator;
    private Randomizer() { generator = new Random(); }
    public static Randomizer getInstance() {
	if (instance == null) 
	    instance = new Randomizer();
	return instance;
    }
    public int nextInt(int bound) {
	return generator.nextInt(bound);
    }
    public boolean oneIn(int upperBound) {
	double randomNum = generator.nextDouble();
	if (randomNum < 1.0/upperBound) return true;
	else return false;
    }
}
