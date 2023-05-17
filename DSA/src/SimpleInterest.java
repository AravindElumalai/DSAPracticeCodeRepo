import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Hello :: Please Enter the principal amount:");
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        System.out.println("Enter the no of years:");
        int years = input.nextInt();
        System.out.println("Enter the rate of interest:");
        float roi = input.nextFloat();

        double finalAmount = ((principal * roi * years) / 100);
        System.out.println("Final Amount ::" + finalAmount);
    }
}
