package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopsUtilsTest {

	@Test
    public void testSumWithForLoop() {
        int result = ConditionalLoopsUtils.sumWithForLoop(5);
        Assert.assertEquals(15, result);
        System.out.println("Test for sumWithForLoop passed");
    }

    @Test
    public void testIsPrimeWithLoop_PrimeNumber() {
        boolean result = ConditionalLoopsUtils.isPrimeWithLoop(17);
        Assert.assertTrue(result);
        System.out.println("Test for isPrimeWithLoop with prime number passed");
    }

    @Test
    public void testIsPrimeWithLoop_NonPrimeNumber() {
        boolean result = ConditionalLoopsUtils.isPrimeWithLoop(10);
        Assert.assertFalse(result);
        System.out.println("Test for isPrimeWithLoop with non-prime number passed");
    }

    @Test
    public void testSumWithForLoop_ZeroInput() {
        int result = ConditionalLoopsUtils.sumWithForLoop(0);
        Assert.assertEquals(0, result);
        System.out.println("Test for sumWithForLoop with zero input passed");
    }

    @Test
    public void testSumWithForLoop_NegativeInput() {
        int result = ConditionalLoopsUtils.sumWithForLoop(-5);
        Assert.assertEquals(0, result); // Sum of numbers from 1 to -5 is 0
        System.out.println("Test for sumWithForLoop with negative input passed");
    }

    @Test
    public void testIsPrimeWithLoop_OneAsInput() {
        boolean result = ConditionalLoopsUtils.isPrimeWithLoop(1);
        Assert.assertFalse(result); // 1 is not a prime number
        System.out.println("Test for isPrimeWithLoop with input 1 passed");
    }

    @Test
    public void testIsPrimeWithLoop_LargePrimeNumber() {
        boolean result = ConditionalLoopsUtils.isPrimeWithLoop(997);
        Assert.assertTrue(result);
        System.out.println("Test for isPrimeWithLoop with large prime number passed");
    }

    @Test
    public void testIsPrimeWithLoop_LargeNonPrimeNumber() {
        boolean result = ConditionalLoopsUtils.isPrimeWithLoop(1000);
        Assert.assertFalse(result);
        System.out.println("Test for isPrimeWithLoop with large non-prime number passed");
    }
}
