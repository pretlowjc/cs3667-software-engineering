import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GBPCoinMintTest {
	
	GBPCoinMint gbcm = GBPCoinMint.getInstance();
	
	
	@Test
	public void testUnthreaded() {
	    GBPCoinMint mint1 = GBPCoinMint.getInstance();
	    GBPCoinMint mint2 = GBPCoinMint.getInstance();
	    
	    assertEquals(mint1, mint2);
	}
	
	@Test
	public void testThreaded() {
	    GBPCoinMint[] mint1 = new GBPCoinMint[1];
	    GBPCoinMint mint2;
	    GBPCoinMint mint3;
	    
	    class testThread implements Runnable {
	        public void run() {
	            try {
	                //Thread.sleep();
	                mint1[0] = GBPCoinMint.getInstance();
	            }
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }    
	    Thread obj = new Thread(new testThread());
	    obj.start();
	    mint2 = GBPCoinMint.getInstance();
	    try {
	        obj.join();
	    }
	    catch(Exception e) {
	        e.printStackTrace();
	    }
	    
        assertSame(mint1[0], mint2);
	    
	}

	@Test
	public void testPence() {
		Coin c = gbcm.createCoin(.01);
		assertTrue(c instanceof Pence);
	}

	@Test void testTwoPence() {
		Coin c = gbcm.createCoin(.02);
		assertTrue(c instanceof TwoPence);
	}
	
	@Test
	public void testFivePence() {
		Coin c  = gbcm.createCoin(.05);
		assertTrue(c instanceof FivePence);
	}

	@Test
	public void testTenPence() {
		Coin c = gbcm.createCoin(.1);
		assertTrue(c instanceof TenPence);
	}

	@Test
	public void testTwentyPence() {
		Coin c = gbcm.createCoin(.2);
		assertTrue(c instanceof TwentyPence);
	}

	@Test 
	public void testFiftyPence() {
		Coin c = gbcm.createCoin(.5);
		assertTrue(c instanceof FiftyPence);
	}
	
    @Test 
	public void testPound() {
		Coin c = gbcm.createCoin(1.0);
		assertTrue(c instanceof Pound);
	}

    @Test 
	public void testTwoPound() {
		Coin c = gbcm.createCoin(2.0);
		assertTrue(c instanceof TwoPound);
	}

    @Test 
	public void testFivePound() {
		Coin c = gbcm.createCoin(5.0);
		assertTrue(c instanceof FivePound);
	}

	@Test
	public void testNullCoin() {
	    Coin c = gbcm.createCoin(-0.125684716874);
	    assertTrue(c.equals(Coin.NULL));
	}
}
