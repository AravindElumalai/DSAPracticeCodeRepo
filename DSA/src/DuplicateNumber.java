import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(sorting(nums));
    }

    static List<Integer> sorting(int[] nums) {
        int i = 0;
        List<Integer> res = new ArrayList<>();
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int current = nums[i] - 1;
                if (nums[i] != nums[current]) {
                    swap(nums, i, current);
                } else {
                    res.add(nums[i]);
                }
            } else {
                i++;
            }

        }

        return res;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
