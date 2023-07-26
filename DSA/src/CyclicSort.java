import java.util.Arrays;

class CyclicSort {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 2, 1, 4 };
        cyclicSorting(nums);
    }

    public static void cyclicSorting(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (i != correctIndex) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }

        }

        System.out.println(Arrays.toString(nums));
    }

}