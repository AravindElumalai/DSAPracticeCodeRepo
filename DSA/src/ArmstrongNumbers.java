import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the first number for find armstrong number:");
        num1 = input.nextInt();
        System.out.println("Enter the Second number for find armstrong number:");
        num2 = input.nextInt();

        for (int i = num1; i < num2; i++) {
            int check, rem, sum = 0;
            check = i;
            while (check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println("" + i + " is a armstrong number");
            }
        }
    }
}
