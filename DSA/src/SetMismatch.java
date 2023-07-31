
/*https://leetcode.com/problems/set-mismatch/ */

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] nums = { 2, 2 };
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] res = new int[2];
        while (i < nums.length) {
            int current = nums[i] - 1;
            if (i != current && nums[i] != nums[current]) {
                swap(nums, i, current);
            } else {
                i++;
            }

        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] { nums[index], index + 1 };
            }
        }
        return res;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
