import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GBPManufactureStepsTest {
    GBPCoinMint gbcm;
	Coin c;
    double[] coinVals = {.01, .02, .05, .1, .2, .5, 1.0, 2.0, 5.0};
    String[] coinNames = {"Pence", "TwoPence", "FivePence", "TenPence", "TwentyPence", "FiftyPence", "Pound", "TwoPound", "FivePound"};

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
	public void testCoinImprint() {
        for (int i = 0; i < coinVals.length; i++ ) {          
            c = gbcm.createCoin(coinVals[i]);
            String expectedResult = "Imprinting " + coinNames[i] + "...completed.\n";
            printPrep();
            c.imprint();
            String testOutput = getTestOutput();

            assertTrue(expectedResult.equals(testOutput),
            "Expected:'" + expectedResult 
            + "' but got '" + testOutput + "'.");
        }
	}

    @Test
	public void testCoinInspect() {
        for (int i = 0; i < coinVals.length; i++ ) {          
            c = gbcm.createCoin(coinVals[i]);
            String expectedResult = "Inspecting " + coinNames[i] + "...completed.\n";
            printPrep();
            c.inspect();
            String testOutput = getTestOutput();

            assertTrue(expectedResult.equals(testOutput),
            "Expected:'" + expectedResult 
            + "' but got '" + testOutput + "'.");
        }
	}

    @Test
	public void testCoinSmooth() {
        for (int i = 0; i < coinVals.length; i++ ) {          
            c = gbcm.createCoin(coinVals[i]);
            String expectedResult = "Smoothing " + coinNames[i] + "...completed.\n";
            printPrep();
            c.smooth();
            String testOutput = getTestOutput();

            assertTrue(expectedResult.equals(testOutput),
            "Expected:'" + expectedResult 
            + "' but got '" + testOutput + "'.");
        }
	}

    @Test
	public void testCoinBuff() {
        for (int i = 0; i < coinVals.length; i++ ) {          
            c = gbcm.createCoin(coinVals[i]);
            String expectedResult = "Buffing " + coinNames[i] + "...completed.\n";
            printPrep();
            c.buff();
            String testOutput = getTestOutput();

            assertTrue(expectedResult.equals(testOutput),
            "Expected:'" + expectedResult 
            + "' but got '" + testOutput + "'.");
        }
	}
}