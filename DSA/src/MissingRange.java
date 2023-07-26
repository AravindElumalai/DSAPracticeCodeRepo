
/*https://leetcode.com/problems/missing-number/ */
public class MissingRange {

    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int num = missingNum(nums);
        System.out.println(num);
    }

    static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // Search the missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
