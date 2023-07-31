/**
 * 
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */
/* https://leetcode.com/problems/guess-number-higher-or-lower/ */
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int guessNum = guess(middle);
            if (guessNum == 0) {
                return middle;
            } else if (guessNum == 1) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    private int guess(int middle) {
        return 0;
    }
}