import java.util.Arrays;

public class LeetCode167TwoSum {

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];
        while (start < end) {
            int res = numbers[start] + numbers[end];
            if (res == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else {
                if (res > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return start >= end ? null : result;
    }
}
