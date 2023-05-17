import java.util.Scanner;

public class ProductNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = in.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = in.nextInt();
        int ans = productNumbers(num1, num2);
        System.out.println("Product of two numbers::" + ans);
    }

    static int productNumbers(int num1, int num2) {
        return num1 * num2;
    }
}
