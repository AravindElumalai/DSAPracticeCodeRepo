import java.util.Arrays;

public class SmallestNumOccurInArray {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 4, 8 };
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (num > nums[j]) {
                    count++;
                }
            }
            res[i] = count;
        }
        System.out.println(Arrays.toString(res));
    }
}
