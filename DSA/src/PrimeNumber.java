import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find its prime or not::");
        int num = in.nextInt();
        boolean isPrimeCheck = isPrimeNumber(num);
        System.out.println("Is given number is prime number:::" + isPrimeCheck);

    }

    static boolean isPrimeNumber(int num) {
        boolean isPrimeCheck = true;
        if (num <= 1) {
            isPrimeCheck = true;
        } else {
            int counter = 2;
            while (counter * counter <= num) {
                if (num % counter == 0) {
                    isPrimeCheck = false;
                }
                counter++;
            }

        }
        return isPrimeCheck;
    }
}
