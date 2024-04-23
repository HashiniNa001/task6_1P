package sit707_week6;

public class ConditionalLoopsUtils {

    /**
     * Function with a simple for loop.
     *
     * @param n The number of iterations for the loop.
     * @return The sum of numbers from 1 to n.
     */
    public static int sumWithForLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Function with a conditional loop and a conditional statement inside the loop.
     *
     * @param num The number to check if it's prime.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrimeWithLoop(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
