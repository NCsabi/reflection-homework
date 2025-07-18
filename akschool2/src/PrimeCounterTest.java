import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeCounterTest {
    @Test
    public void testSmallRange() {
        assertEquals(4, PrimeCounter.countingPrimes(1, 10)); // 2, 3, 5, 7
    }
    @Test
    public void testNoPrimes() {
        assertEquals(0, PrimeCounter.countingPrimes(0,1));
    }
    @Test
    public void testSpecifiedRange() {
        assertEquals(144, PrimeCounter.countingPrimes(1000, 2073));
    }
}
