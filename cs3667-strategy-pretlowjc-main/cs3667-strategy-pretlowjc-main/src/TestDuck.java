
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class TestDuck {

    // Fields used between test methods need to be static
    static Duck d;  // Every test needs a Duck object

    @BeforeEach
    void init() {
	d = new Duck("me");
    }

    void setupOut() {
		originalOut = System.out;     // save to restore later
		baos = new ByteArrayOutputStream();
		newOut = new PrintStream(baos);
		System.setOut(newOut);
	}
	
	String breakdownOut() {
		System.out.flush();
		String actualOutput = baos.toString();
		System.setOut(originalOut);
		return actualOutput;
	}	

    @Test
    void testDisplay() {
	// Prep
	setupOut();
	
	// Test: method writes to System.out which has been redirected
	d.display();

	// Check results
    String actualOutput = breakdownOut();
    String expectedOutput = "I'm a duck named me.\n";
    assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFly() {
	// Prep
	setupOut();

	// Test: method writes to System.out which has been redirected
	d.fly();

	// Check results
	String actualOutput = breakdownOut();
	String expectedOutput = "me is flying!!\n";
	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testQuack() {
	// Prep
	setupOut();

	// Test: method writes to System.out which has been redirected
	d.quack();

	// Check results
	String actualOutput = breakdownOut();
	String expectedOutput = "me says Quack.\n";
	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSwim() {
	// Prep
	setupOut();

	// Test: method writes to System.out which has been redirected
	d.swim();

	// Check results
	String actualOutput = breakdownOut();
	String expectedOutput = "me's webbed feet a paddlin'...\n";
	assertEquals(expectedOutput, actualOutput);
    }
}
