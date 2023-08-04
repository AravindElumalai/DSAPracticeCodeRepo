public class SqrtUsingBS {

    public static void main(String[] args) {
        System.out.print(squareRoot(2147395599));
    }

    public static int mySqrt(int number) {
       if (number == 0 || number == 1) {
            return number;
        }
        long low = 1;
        long high = number/2;
        long res = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == number) {
                return (int) mid;
            } else if (mid * mid < number) {
                low = mid + 1;
                res = mid;
            } else {
                high = mid - 1;
            }
        }
        return (int)res;
    }
}
