import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = in.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = in.nextInt();
        System.out.println("Enter the 3rd number:");
        int num3 = in.nextInt();
        int maxNum = max_number(num1, num2, num3);
        int minNum = min_number(num1, num2, num3);
        System.out.println("Max Number::" + maxNum);
        System.out.println("Min Number::" + minNum);
    }

    static int max_number(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    static int min_number(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
}