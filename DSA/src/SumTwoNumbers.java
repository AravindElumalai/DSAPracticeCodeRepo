import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();
        System.out.println("Enter the second number ::");
        int num2 = in.nextInt();
        int ans = sumTwoNumbers(num1, num2);
        System.out.println("Sum of two numbers::" + ans);
    }

    static int sumTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
