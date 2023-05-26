import java.util.Scanner;

public class DiscountPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the listing price:");
        double listPrice = in.nextDouble();
        System.out.println("Enter the selling price:");
        double sellingPrice = in.nextDouble();
        double discout = (((listPrice - sellingPrice) / listPrice) * 100);
        System.out.println("Discount Percentage is::" + discout);
    }
}
