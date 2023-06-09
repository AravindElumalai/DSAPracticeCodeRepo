import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        int target = 6;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int currentNum = 0;
        int nextNum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                currentNum = nums[i];
                nextNum = nums[j];
                if ((currentNum + nextNum) == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
