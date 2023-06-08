
/* https://leetcode.com/problems/flipping-an-image/ */

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        for (int[] row : image) {
            int start = 0;
            int end = row.length - 1;
            while (start <= end) {
                if (row[start] == row[end]) {
                    row[start] ^= 1;
                    row[end] = row[start];
                }
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(image));

    }
}
