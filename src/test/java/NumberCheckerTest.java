import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTest {

    @Test
    public void emptyInputArrayIsEqualToZero() {
        int[] numbers = {};
        assertEquals(NumberChecker.EVEN, NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroMustBeEven() {
        int[] numbers = {0};
        assertEquals(NumberChecker.EVEN, NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroPlusOneMustBeOdd() {
        int[] numbers = {0, 1};
        assertEquals(NumberChecker.ODD, NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroPlusTwoMustBeEven() {
        int[] numbers = {0, 2};
        assertEquals(NumberChecker.EVEN, NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroPlusThreeMustBeOdd() {
        int[] numbers = {0, 3};
        assertEquals(NumberChecker.ODD, NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroPlusFourMustBeEven() {
        int[] numbers = {0, 4};
        assertEquals(NumberChecker.EVEN, NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void evenPlusEvenMustEven() {
        int[] numbers = {0, 2, 4, 6, 8, 10};
        assertEquals(NumberChecker.EVEN, NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void plusTwoOddNumberMustBeEven() {
        checkNumberSerie(1, 99, 2, NumberChecker.EVEN);
    }

    @Test
    public void plusTwoEvenNumberMustBeEven() {
        checkNumberSerie(0, 100, 2, NumberChecker.EVEN);
    }

    @Test
    public void plusEvenAndOddMustBeOdd() {
        checkNumberSerie(0, 100, 1, NumberChecker.ODD);
    }

    @Test(expected = NullPointerException.class)
    public void nullEnterProduceNullPointerException() {
        int[] numbers = null;
        assertEquals("", NumberChecker.evenOrOdd(numbers));
    }

    private void checkNumberSerie(int start, int end, int increment, String expected) {
        for (int i = start; i <= end; i = i + increment) {
            int[] numbers = {i, i + increment};
            assertEquals(expected, NumberChecker.evenOrOdd(numbers));
        }
    }
}
