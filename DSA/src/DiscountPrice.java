import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the listing price:");
        double listPrice = in.nextDouble();
        System.out.println("Enter the discount:");
        double discount = in.nextDouble();
        double sellingPrice = (listPrice - (listPrice * (discount / 100)));
        System.out.println("selling price is::" + sellingPrice);
        System.out.println("Discount Amount is::" + (listPrice - sellingPrice));
    }
}
