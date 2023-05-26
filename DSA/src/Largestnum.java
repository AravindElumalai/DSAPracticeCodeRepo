import java.util.Scanner;

public class Largestnum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, largest = 0;
        int num2 = 0;
        while ((num1 = in.nextInt()) != 0) {
            System.out.println("Num1::" + num1);
            if (num1 > num2) {
                largest = num1;
                num2 = num1;
            } else if (num1 < num2) {
                largest = num2;
                num1 = num2;
            }

        }
        System.out.println("Largest::" + largest);
    }
}
