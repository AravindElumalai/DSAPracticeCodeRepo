import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        double base = in.nextDouble();
        System.out.println("Enter the height of the traingle:");
        double height = in.nextDouble();
        double area = 1 * base * height / 2;
        System.out.println("Area of the trianlge::" + area);
    }
}
