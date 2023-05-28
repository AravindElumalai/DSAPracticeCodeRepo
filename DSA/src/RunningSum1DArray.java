import java.util.Arrays;

public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        // op: 1,3,6,10,15,21
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
