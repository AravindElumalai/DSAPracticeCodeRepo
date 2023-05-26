import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = { 1, 4, 5, 6, 7, 8, 2, 3, 9, 0 }; // [1,4,5,6,7][8,2,3,9,0]
        int[] finalAns = new int[2 * n];
        int j = 0;
        for (int i = 0; i < finalAns.length - 1; i += 2) {
            finalAns[i] = nums[j++];
            finalAns[i + 1] = nums[n++];
        }
        System.out.println(Arrays.toString(finalAns));

    }
}
