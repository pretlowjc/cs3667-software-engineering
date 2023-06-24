import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class USDCoinMintTest {
	
	USDCoinMint uscm = USDCoinMint.getInstance();
	
	
	@Test
	public void testUnthreaded() {
	    USDCoinMint mint1 = USDCoinMint.getInstance();
	    USDCoinMint mint2 = USDCoinMint.getInstance();
	    
	    assertEquals(mint1, mint2);
	}
	
	@Test
	public void testThreaded() {
	    USDCoinMint[] mint1 = new USDCoinMint[1];
	    USDCoinMint mint2;
	    USDCoinMint mint3;
	    
	    class testThread implements Runnable {
	        public void run() {
	            try {
	                //Thread.sleep();
	                mint1[0] = USDCoinMint.getInstance();
	            }
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }    
	    Thread obj = new Thread(new testThread());
	    obj.start();
	    mint2 = USDCoinMint.getInstance();
	    try {
	        obj.join();
	    }
	    catch(Exception e) {
	        e.printStackTrace();
	    }
	    
        assertSame(mint1[0], mint2);
	    
	}

	// @Test
	// public void testCoinObj(){
		

	// 	double[] denoms = {0.01, 0.05, 0.1, 0.25, 0.5, 1.0};
	// 	Coin[] coins = {new Penny(), new Nickel(), new Dime(), new Quarter(), new HalfDollar(), new Dollar()};
	// 	for(int i = 0; i < denoms.length; i++) {
	// 		Coin c = uscm.createCoin(denom[i]);
	// 		assertTrue(c instanceof coins[i]);
	// 	}
	// }

	@Test
	public void testPenny() {
		Coin c = uscm.createCoin(.01);
		assertTrue(c instanceof Penny);
	}

	@Test void testNickel() {
		Coin c = uscm.createCoin(.05);
		assertTrue(c instanceof Nickel);
	}
	
	@Test
	public void testDime() {
		Coin c  = uscm.createCoin(.10);
		assertTrue(c instanceof Dime);
	}

	@Test
	public void testQuarter() {
		Coin c = uscm.createCoin(.25);
		assertTrue(c instanceof Quarter);
	}

	@Test
	public void testHalfDollar() {
		Coin c = uscm.createCoin(.5);
		assertTrue(c instanceof HalfDollar);
	}

	@Test 
	public void testDollar() {
		Coin c = uscm.createCoin(1.0);
		assertTrue(c instanceof Dollar);
	}
	
	@Test
	public void testNullCoin() {
	    Coin c = uscm.createCoin(-0.125684716874);
	    assertTrue(c.equals(Coin.NULL));
	}
}
