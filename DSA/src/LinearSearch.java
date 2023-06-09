public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 6, 10, 12 };
        int target = 13;
        System.out.println(linearSearch(nums, target));
    }

    /* Best case O(1) where the target is found at 0 index */
    /*
     * Worst case O(N) where the given target is not found in the array, we will
     * iterate throughout the array looking at the target
     */
    static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}