import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number::");
        int a = input.nextInt();
        System.out.println("Enter the second number::");
        int b = input.nextInt();
        if (a < b) {
            System.out.println("The Second number is the largest number" + b);
        } else {
            System.out.println("The First number is the largest number" + a);
        }
    }
}
