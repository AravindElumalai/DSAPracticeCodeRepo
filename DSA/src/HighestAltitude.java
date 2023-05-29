import java.util.Arrays;

/* https://leetcode.com/problems/find-the-highest-altitude/ */
public class HighestAltitude {

    public static void main(String[] args) {
        int[] gain = { 44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85, -39, 67, -63, 64,
                -47, 95, 91, -40, 65, 67, 92, -28, 97, 100, 81 };
        int[] altitudeArr = new int[gain.length + 1];
        altitudeArr[0] = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {

            sum = sum + gain[i];

            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
