import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int num1 = num;
        int op = 0;
        /* One Way */
        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }
        /* Second Way */
        while (num1 > 0) {
            int rem = num1 % 10;
            op = op * 10 + rem;
            num1 = num1 / 10;
        }
        System.out.println(op);
    }
}
