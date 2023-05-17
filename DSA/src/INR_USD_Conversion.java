import java.util.Scanner;

public class INR_USD_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency:::");
        double currency = input.nextDouble();
        double conversion = currency * 0.01223;
        System.out.println("The corresponding value of INR to USD is ::" + conversion);
    }
}
