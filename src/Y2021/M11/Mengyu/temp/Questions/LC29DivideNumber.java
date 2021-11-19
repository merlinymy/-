package Y2021.M11.Mengyu.temp.Questions;

public class LC29DivideNumber {
    public int divide(int dividend, int divisor) {
        // 10 2

        int negative = 2;
        if (dividend < 0) {
            dividend = -dividend;
            negative--;
        }
        if (divisor < 0) {
            divisor = -divisor;
            negative--;
        }
        if (divisor == 1) {
            return dividend;
        } else if (divisor == -1) {
            return -dividend;
        }
        int res = 0;
        while (dividend - divisor >= 0) {
            res++;
            dividend -= divisor;
        }
        if (negative == 1) {
            return -res;
        } else {
            return res;
        }
    }

    public static void main(String[] args) {
        int numerator = -2147483648;
        int denomnnator = -1;
        LC29DivideNumber test = new LC29DivideNumber();
        System.out.println(test.divide(numerator, denomnnator));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(-2147483648 / -1);
    }
}
