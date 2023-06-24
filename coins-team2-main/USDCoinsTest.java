import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class USDCoinsTest {
	
	USDCoinMint uscf = USDCoinMint.getInstance();
	double[] coinVals = {.01, .05, .1, .25, .5, 1.0};


	@Test
	public void testNullCoinDenomination() {
	    Coin c = uscf.createCoin(-1.32435454534);
	    double testVal = c.getDenomination();
	    
	    assertEquals(testVal, -1.0);
	}
	
	@Test
	public void testNullCoinCountryCode() {
        Coin c = uscf.createCoin(-1.32435454534);
        String testVal = c.getCountryCode();
        
        assertEquals(testVal, "");
    }

	// Test all us coins with multiple assertEquals in this method.
	@Test
	public void testGetDenomination() {
		for (double expectedVal : coinVals ) {
			Coin c = uscf.createCoin(expectedVal);
			double testVal = c.getDenomination();

			assertEquals(testVal, expectedVal, .00010);
		}
	}
    
    @Test
    public void testGetCountryCode() {
        String expectedVal = "USD";
        for (double cV : coinVals) {
            Coin c = uscf.createCoin(cV);
            String testVal = c.getCountryCode();
            
			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
        }
    }

}

