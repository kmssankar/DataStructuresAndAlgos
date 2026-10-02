package numtheory;

public class Sqrt {

    public static void main(String[] args) {

        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x <= 0)
            return 0;
        if (x <= 3) {
            return 1;
        }
        int prev = 2;
        int end = Integer.MAX_VALUE;
        int start = Integer.MIN_VALUE;
        int sqr = 0;
        for (int i = 0; i <= 32; i++) {
            sqr = (1 << i);
            System.out.println( start + " end -> " + end + " Sqr " + sqr  + " x " + x + " srq > " + (sqr > x));
            if ((sqr > x) || (sqr < 1) ) {
                end = 1 << (i/2);
                break;
            } else {
                start = 1 << (i/2);
            }

        }

        System.out.println(start + " " + end);

        prev = start;

        while (start <= end && (start > 0)) {
            int mid = (start + end) / 2;

            System.out.println(start + " " + end + " " + mid);
            int midSquare = mid * mid;

            if (midSquare == x) {
                return mid;
            } else if (midSquare > x) {

                end = mid - 1;
            } else {
                prev = mid;
                start = mid + 1;
            }
        }

        return prev;
    }
}
