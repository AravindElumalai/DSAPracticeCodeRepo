
/* https://leetcode.com/problems/flipping-an-image/ */

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] res;
        for (int i = 0; i < image.length; i++) {
            for (int j = image[i].length - 1; j <= 0; j--) {
                // res[i][j] = image[i][j];
            }
        }

        System.out.println(Arrays.toString(image[0]));
        System.out.println(Arrays.toString(image[1]));
        System.out.println(Arrays.toString(image[2]));
    }
}
