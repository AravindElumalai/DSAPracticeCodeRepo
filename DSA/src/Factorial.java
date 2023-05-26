import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find factorial::");
        int num = in.nextInt();
        int fact = num;
        while (num > 1) {
            num--;
            fact = fact * num;

        }

        System.out.println(fact);
    }
}
