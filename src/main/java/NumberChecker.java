public class NumberChecker {

    public static final String EVEN = "even";
    public static final String ODD = "odd";

    public static String evenOrOdd(int[] numbers) {
        int sum = calculateSum(numbers);
        return isEven(sum) ? EVEN : ODD;
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
