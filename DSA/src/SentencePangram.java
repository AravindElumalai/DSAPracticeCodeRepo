import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* https://leetcode.com/problems/check-if-the-sentence-is-pangram/*/
public class SentencePangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        char[] charArr = sentence.toCharArray();
        Set<Character> chSet = new HashSet<>();
        boolean res = true;
        for (char cha : charArr) {
            chSet.add(cha);

        }
        if (chSet.size() < 26) {
            res = false;
        }

        System.out.println(res);

    }
}
