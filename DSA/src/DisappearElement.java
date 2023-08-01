import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearElement {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        System.out.println(sorting(nums));
    }

    static List<Integer> sorting(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int current = nums[i] - 1;
            if (nums[i] != nums[current]) {
                swap(nums, i, current);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                res.add(j + 1);
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
