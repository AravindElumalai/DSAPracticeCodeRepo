import java.util.HashMap;

public class NumberGoodPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 9, 4, 2, 3, 1, 4, 5, 8, 9, 5, 4, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            System.out.println(map.getOrDefault(num, 0));
            int count = map.getOrDefault(num, 0);
            ans += count;
            map.put(num, count + 1);

        }

        System.out.println(ans);
    }
}