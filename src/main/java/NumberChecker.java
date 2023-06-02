public class NumberChecker {

    public static final String EVEN = "even";
    public static final String ODD = "odd";

    public static String evenOrOdd(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        String result = sum % 2 == 0 ? EVEN : ODD;
        return result;
    }
}
