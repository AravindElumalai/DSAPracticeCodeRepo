import java.util.Scanner;

public class SubProdSumNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number::");
        int num = in.nextInt();
        int prod = 1;
        int sum = 0;
        int sub = 0;
        while (num > 0) {
            int rem = num % 10;
            prod = prod * rem;
            sum = sum + rem;
            num = num / 10;
        }
        sub = prod - sum;
        System.out.println("Difference between prod and sum is:" + sub);
    }
}
