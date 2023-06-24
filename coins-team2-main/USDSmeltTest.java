import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class USDSmeltTest {
	
	USDCoinMint uscm;
	Coin c;

	PrintStream origOut;
	ByteArrayOutputStream baos;
	PrintStream newOut;

	@BeforeEach
	public void init() {
		uscm = USDCoinMint.getInstance();
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
	public void testPennySmelt() {
		c = uscm.createCoin(.01);
		String expectedResult = "Smelting Penny with 2.5% Cu and 97.5% Zn...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testNickelSmelt() {
		c = uscm.createCoin(.05);
		String expectedResult = "Smelting Nickel with 75% Cu and 25% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testDimeSmelt() {
		c = uscm.createCoin(.1);
		String expectedResult = "Smelting Dime with 91.67% Cu and 8.33% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testQuarterSmelt() {
		c = uscm.createCoin(.25);
		String expectedResult = "Smelting Quarter with 91.67% Cu and 8.33% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testHalfDollarSmelt() {
		c = uscm.createCoin(.5);
		String expectedResult = "Smelting HalfDollar with 91.67% Cu and 8.33% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testDollarSmelt() {
		c = uscm.createCoin(1);
		String expectedResult = "Smelting Dollar with 88.5% Cu, 6% Zn, 3.5% Mn, and 2% Ni...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}
}
