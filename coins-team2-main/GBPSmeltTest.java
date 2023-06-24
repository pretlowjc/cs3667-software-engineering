import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GBPSmeltTest {
	
	GBPCoinMint gbcm;
	Coin c;

	PrintStream origOut;
	ByteArrayOutputStream baos;
	PrintStream newOut;

	@BeforeEach
	public void init() {
		gbcm = GBPCoinMint.getInstance();
	}
	
	private void printPrep() {
		origOut = System.out;
		baos = new ByteArrayOutputStream();
		newOut = new PrintStream(baos);
		System.setOut(newOut);
	}

	private String getTestOutput() {
		System.out.flush();
		String testOutput = baos.toString();
		System.setOut(origOut);
		return testOutput;
	}


	@Test
	public void testPenceSmelt() {
		c = gbcm.createCoin(.01);
		String expectedResult = "Smelting Pence with Cu plated steel...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testTwoPenceSmelt() {
		c = gbcm.createCoin(.02);
		String expectedResult = "Smelting TwoPence with Cu plated steel...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testFivePenceSmelt() {
		c = gbcm.createCoin(.05);
		String expectedResult = "Smelting FivePence with 75% Cu and 25% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testTenPenceSmelt() {
		c = gbcm.createCoin(.1);
		String expectedResult = "Smelting TenPence with 75% Cu and 25% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testTwentyPenceSmelt() {
		c = gbcm.createCoin(.2);
		String expectedResult = "Smelting TwentyPence with 84% Cu and 16% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testFiftyPenceSmelt() {
		c = gbcm.createCoin(.5);
		String expectedResult = "Smelting FiftyPence with 75% Cu and 25% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

    @Test
	public void testPoundSmelt() {
		c = gbcm.createCoin(1.0);
		String expectedResult = "Smelting Pound with 70% Cu, 24.5% Zi, and 5.5% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

    @Test
	public void testTwoPoundSmelt() {
		c = gbcm.createCoin(2.0);
		String expectedResult = "Smelting TwoPound with 76% Cu and 20% Zi and 4% Ni in the outer ring" +
                                " and 75% Cu and 25% Ni in the inner ring...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

    @Test
	public void testFivePoundSmelt() {
		c = gbcm.createCoin(5.0);
		String expectedResult = "Smelting FivePound with 75% Cu and 25% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}
}
