import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class XxxxToppingDecorator extends ToppingDecorator {
    public XxxxToppingDecorator() {
        super("XxxxToppingDecorator for testing only!");
    }
    public String getDescription() {
        return "XxxxToppingDecorator for testing only!";
    }
    public String toString() {
        return "Empty XxxxToppingDecorator test object";
    }

    public double cost() {
        return 0.0;
    }

    public int calories() {
        return 0;
    }

    public boolean hasNuts() {
        return false;
    }
}

public class ToppingDecoratorTest {
    @Test
    public void testConstructor() {
        try {
            ToppingDecorator xxxxToppingDecorator = new XxxxToppingDecorator();

            assertNotNull(xxxxToppingDecorator);
        }
        catch (Exception e) {
            fail("Constructor threw exception: " + e.getMessage());
        }
    }

    @Test
    public void testDescription() {
	    ToppingDecorator xxxxToppingDecorator = new XxxxToppingDecorator();
	    String expectedResult = "XxxxToppingDecorator for testing only!";
	    String testOutput = null;

	    testOutput = xxxxToppingDecorator.getDescription();

	    assertTrue(expectedResult.equals(testOutput),
		    "Expected:'" + expectedResult 
		    + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testToString() {

        ToppingDecorator xxxxToppingDecorator = new XxxxToppingDecorator();

        String expectedResult = "Empty XxxxToppingDecorator test object";
        String testOutput = null;

        PrintStream origOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(baos);
        System.setOut(newOut);

        System.out.print(xxxxToppingDecorator);

        System.out.flush();
        testOutput = baos.toString();
        System.setOut(origOut);

        assertTrue(expectedResult.equals(testOutput),
            "Expected:'" + expectedResult 
            + "' but got '" + testOutput + "'.");
    }
}
