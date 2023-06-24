import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PowderedSugarTest {
    @Test 
    public void testConstructor() {
        try {
            Cookie yum = new GingerbreadCookie();
            yum = new PowderedSugar(yum);
            assertNotNull(yum);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }
    }

    @Test
    public void testDescription() {
        Cookie yum = new GingerbreadCookie();
        yum = new PowderedSugar(yum);

        String expectedResult = "Gingerbread, Powdered Sugar";
        String testOutput = null;

        testOutput = yum.getDescription();

        assertTrue(expectedResult.equals(testOutput),
            "Expected: '" + expectedResult 
            + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testCalories() {
        Cookie yum = new GingerbreadCookie();
        yum = new PowderedSugar(yum);

        int expectedResult = 100;
        int testOutput = 0;

        testOutput = yum.calories();

        assertEquals(expectedResult, testOutput,
            "Expected: " + expectedResult
            + ", but got: " + testOutput);
    }

    @Test
    public void testCost() {
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
    Cookie yum = new GingerbreadCookie();
    yum = new PowderedSugar(yum);

	// 1b. Declare actual and expected outputs
	double expectedResult = 0.20;
	double testOutput = 0;

	// 2. Conduct test of method 
	testOutput = yum.cost();

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertEquals(expectedResult, testOutput, 
		     "Expected: " + expectedResult 
		     + ", but got: " + testOutput);
    }

    @Test
    public void testToString() {
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
    Cookie yum = new GingerbreadCookie();
    yum = new PowderedSugar(yum);

	// 1b. Declare actual and expected outputs
	String expectedResult = "[[Gingerbread,101,$ 0.5],Powdered Sugar,100,$ 0.2]";
	String testOutput = null;

	// 1c. Save current System.out and set to new stream we can read.
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// 2. Conduct method test (print/println call toString automatically)
	System.out.print(yum);

	// 3. Test Cleanup
	// 3a.Get all the stuff the method wrote to System.out, and reset it.
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
}