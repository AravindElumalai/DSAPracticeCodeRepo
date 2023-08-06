public class LC1608 {
    public static void main(String[] args) {
        int[] nums = { 3, 6, 7, 7, 0 };
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            int count = 0;
            for (int j : nums) {
                if (j >= i) {
                    count++;
                }
            }
            if (i == count) {
                return i;
            }
        }
        return -1;
    }
}
