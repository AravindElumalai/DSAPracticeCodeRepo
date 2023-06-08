public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = countDigits(num);
            if (checkEven(digits)) {
                count++;
            }
        }
        return count;
    }

    static int countDigits(int num) {
        int count = 0;
        if (num > 0) {
            while (num > 0) {
                count++;
                num = num / 10;
            }
        }
        return count;
    }

    static boolean checkEven(int count) {
        return count % 2 == 0;
    }
}
