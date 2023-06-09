public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 6, 7, 9, 10, 13, 15, 17, 20 };
        int target = 14;
        System.out.println(binarySearch(nums, target));
    }

    /* if your array is sorted then use binary search */
    /* Best case O(1) where the target found in the mid */
    /* Worst Case O(logN) */
    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = start + 1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
