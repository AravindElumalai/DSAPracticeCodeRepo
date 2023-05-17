import java.util.Scanner;

public class FindANumberOccurance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        System.out.println("Enter the number to find the occurance from given input");
        int findNum = input.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10; /* get the last digit from the given number */
            if (rem == findNum) {
                count++;
            }
            num = num / 10; /* elimnate the last digit from the given number */

        }
        System.out.println("" + count);
    }
}