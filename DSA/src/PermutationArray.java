import java.util.Scanner;

public class PermutationArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the array::");
        int length = in.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i <= length - 1; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Arrays::" + nums.toString());
        System.out.println(buildArray(nums));

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
