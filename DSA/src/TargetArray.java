import java.util.Arrays;

/*https://leetcode.com/problems/create-target-array-in-the-given-order/
 * 
 * check this solution later 
 */

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int[] index = { 0, 2, 5, 3, 1, 0 };
        int[] targetArr = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            try {
                // targetArr[index[i]];
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            targetArr[index[i]] = nums[i];
        }
        System.out.println(Arrays.toString(targetArr));
    }
}
