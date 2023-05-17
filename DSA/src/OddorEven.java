import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find even or odd::");
        int num = input.nextInt();
        String result = find_odd_even(num);
        System.out.println(result);
    }

    static String find_odd_even(int num) {
        if (num % 2 == 0) {
            return "The given number is Even number";
        } else {
            return "The given number is Odd number";
        }
    }
}
