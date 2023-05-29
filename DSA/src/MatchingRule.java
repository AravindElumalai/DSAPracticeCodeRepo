import java.util.ArrayList;
import java.util.List;

/* https://leetcode.com/problems/count-items-matching-a-rule/*/
public class MatchingRule {

    public static void main(String[] args) {
        List<String> prod = new ArrayList<>();
        List<String> prod1 = new ArrayList<>();
        List<String> prod2 = new ArrayList<>();
        List<List<String>> items = new ArrayList<>();
        prod.add("phone");
        prod.add("blue");
        prod.add("pixel");
        items.add(0, prod);
        prod1.add("computer");
        prod1.add("silver");
        prod1.add("lenovo");
        items.add(1, prod1);
        prod2.add("phone");
        prod2.add("gold");
        prod2.add("iphone");
        items.add(2, prod2);
        String ruleKey = "type";
        String ruleValue = "phone";
        int count = 0;
        for (List<String> lst : items) {
            if (ruleKey.equals("type") && ruleValue.equals(lst.get(0))) {
                count++;
            }
            if (ruleKey.equals("color") && ruleValue.equals(lst.get(1))) {
                count++;
            }
            if (ruleKey.equals("name") && ruleValue.equals(lst.get(2))) {
                count++;
            }
        }

        System.out.println("count::" + count);
    }
}
