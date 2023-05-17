import java.util.Scanner;

public class Number_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first  numb numbers:");
        int a = input.nextInt();
        System.out.println("Enter the second  numb numbers:");
        int b = input.nextInt();
        System.out.println("Enter the express to get O/P:");
        String expression = input.next();
        if (expression.equals("+")) {
            System.out.println("The Addition of two numbers::" + (a + b));
        } else if (expression.equals("-")) {
            System.out.println("The Subcration of two numbers::" + (a - b));
        } else if (expression.equals("*")) {
            System.out.println("The Multiplication of two numbers::" + (a * b));
        } else if (expression.equals("/")) {
            System.out.println("The Division of two numbers::" + (a / b));
        }
    }
}
