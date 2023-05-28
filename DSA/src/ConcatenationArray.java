import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int newSize = 2 * arr.length;
        int[] ans = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            if (i < arr.length) {
                ans[i] = arr[i];
            } else {
                ans[i] = arr[i - arr.length];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
