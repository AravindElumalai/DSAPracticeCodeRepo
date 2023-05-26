import java.util.Scanner;

public class SumAll {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        while ((a = in.nextInt()) != 0) {
            System.out.println("SUM::" + sum);
            System.out.println("A::" + a);
            sum = sum + a;
            System.out.println("SUM After::" + a);
        }
        System.out.println("Sum ::" + sum);
    }
}
