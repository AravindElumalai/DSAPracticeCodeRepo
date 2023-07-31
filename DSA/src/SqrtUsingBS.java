public class SqrtUsingBS {

    public static void main(String[] args) {
        System.out.print(squareRoot(2147395599));
    }

    public static int squareRoot(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        int low = 1;
        int high = number / 2;
        int res = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == number) {
                return mid;
            } else if (mid * mid < number) {
                low = mid + 1;
                res = mid;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
