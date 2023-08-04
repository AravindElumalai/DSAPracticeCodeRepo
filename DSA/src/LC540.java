public class LC540 {
    public static void main(String[] args) {
        int[] nums = { 1 };
        singleNonDuplicate(nums);
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        int ans = 0;
        while (start <= end) {

            if (nums[start] == nums[start + 1]) {
                start = start + 2;
            }
            if (nums[end] == nums[end - 1]) {
                end = end - 2;
            }
            if (start == end) {
                ans = nums[start];
                break;
            }
        }
        return ans;
    }
}
