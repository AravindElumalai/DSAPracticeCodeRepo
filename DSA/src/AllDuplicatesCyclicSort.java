import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicatesCyclicSort {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicate(nums));
    }

    public static List<Integer> findDuplicate(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (i != correctIndex && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);

            } else {
                i++;
            }

        }

        for (int index = 0; index < nums.length; index++) {
            if (index + 1 != nums[index]) {
                duplicates.add(nums[index]);
            }
        }
        return duplicates;

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
