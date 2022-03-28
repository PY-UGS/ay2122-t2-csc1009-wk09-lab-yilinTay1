package wk09_Lab;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.Random;

public class TestRandomCharacter {
    /**
     * Generate fifteen random characters in each of the above four categories.
     * And then you need to write unit test program by creating
     * one unit testing case to test all the methods you have created
     */
    RandomCharacter RandomTest;
    
    @Before
    public void setUp() throws Exception {
        RandomTest = new RandomCharacter();
        System.out.println("Set up");
    }

    @Test
    public void testGetRandomLowerCaseLetter() {
        char output = RandomTest.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(output));
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        char output = RandomTest.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(output));
    }

    @Test
    public void testGetRandomDigitCharacter() {
        char output = RandomTest.getRandomDigitCharacter();
        assertTrue(Character.isDigit(output));
    }

    @Test
    public void testGetRandomCharacter() {
        char output = RandomTest.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(output));
    }

    @Test
    public void testGetPrimeNumber() {
        int output = RandomTest.getRandomPrimeDigit();
        assertTrue(RandomTest.isPrime(output));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }
}
