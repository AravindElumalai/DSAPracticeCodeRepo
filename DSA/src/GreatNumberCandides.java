import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatNumberCandides {
    public static void main(String[] args) {
        int extraCand = 3;
        int[] cand = { 1, 5, 2, 7, 3, 9 };
        int max = 0;
        for (int candy : cand) {
            if (candy > max)
                max = candy;
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : cand) {
            result.add(candy + extraCand >= max);
        }
        System.out.println(result);
    }
}
