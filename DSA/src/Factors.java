import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find factors:");
        int num = in.nextInt();
        int count = 2;
        List<Integer> factors = new ArrayList<>();
        factors.add(1);
        factors.add(num);
        int qu = num;
        int looprun = 0;
        int looprunfor = 0;

        while (count < qu) {
            looprun++;
            if (num % count == 0) {
                qu = num / count;
                System.out.println(qu);
                System.out.println(count);
                factors.add(count);
                factors.add(qu);
            }
            count++;
        }
        Collections.sort(factors);
        System.out.println("Factors ::" + factors);
        System.out.println("looprun while::" + looprun);

        for (int i = 1; i <= num; i++) {
            looprunfor++;
            if (num % i == 0) {
                System.out.print(i + " ,");
            }
        }
        System.out.println("looprun for::" + looprunfor);

    }
}
