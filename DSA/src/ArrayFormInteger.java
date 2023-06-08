import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayFormInteger {

    public static void main(String[] args) {
        int[] num = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int k = 1;

        System.out.println(addArray(num, k));
    }

    static List<Integer> addArray(int[] nums, int k) {
        List<Integer> res = new LinkedList<>();
        for (int i = nums.length - 1; i >= 0; --i) {
            res.add(0, (nums[i] + k) % 10);
            k = (nums[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }
}
