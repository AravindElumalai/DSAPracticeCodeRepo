import java.util.HashSet;
import java.util.Set;

public class LC1346CheckIfExist {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 11 };
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}