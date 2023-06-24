import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GBPCoinsTest {
	
	GBPCoinMint gbcf = GBPCoinMint.getInstance();
	double[] coinVals = {.01, .02, .05, .1, .20, .5, 1.0, 2.0, 5.0};


	@Test
	public void testNullCoinDenomination() {
	    Coin c = gbcf.createCoin(-1.32435454534);
	    double testVal = c.getDenomination();
	    
	    assertEquals(testVal, -1.0);
	}
	
	@Test
	public void testNullCoinCountryCode() {
        Coin c = gbcf.createCoin(-1.32435454534);
        String testVal = c.getCountryCode();
        
        assertEquals(testVal, "");
    }

	// Test all british coins with multiple assertEquals in this method.
	@Test
	public void testGetDenomination() {
		for (double expectedVal : coinVals ) {
			Coin c = gbcf.createCoin(expectedVal);
			double testVal = c.getDenomination();

			assertEquals(testVal, expectedVal, .00010);
		}
	}
    
    @Test
    public void testGetCountryCode() {
        String expectedVal = "GBP";
        for (double cV : coinVals) {
            Coin c = gbcf.createCoin(cV);
            String testVal = c.getCountryCode();
            
			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
        }
    }

}

