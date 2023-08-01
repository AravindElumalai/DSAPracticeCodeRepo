public class LC1539KthMissingPostivie {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) {
            return k;
        }
        int start = 0;
        int end = arr.length - 1;
        int closestInt = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) < k) {
                closestInt = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return k + closestInt;
    }
}
