public class Sinus {

    public static double sin(double x) {
        double result = 0.0;

        for (int n = 0; n < 10; n++) {
            result += Math.pow(-1.0, n) * Math.pow(x, 2 * n + 1) / getFactorial(2 * n + 1);
        }
        return result;
    }

    private static long getFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
