public class divop {
    public static void main(String[] args) {

        int dividend = 22;
        int divisor = 3;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            System.out.println(Integer.MAX_VALUE);
            return;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;

        while (a >= b) {
            int i = 0;

            while (a >= (b << (i + 1))) {
                i++;
            }

            a = a - (b << i);
            quotient = quotient + (1L << i);
        }

        if (negative) {
            quotient = -quotient;
        }

        System.out.println(quotient);
    }
}
