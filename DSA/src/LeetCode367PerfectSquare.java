public class LeetCode367PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1 || num == 0) {
            return true;
        }
        long start = 1;
        long end = num;
        while (start <= end) {
            long middle = start + (end - start) / 2;
            if (middle * middle == num) {
                return true;
            } else if (middle * middle < num) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false;
    }
}
