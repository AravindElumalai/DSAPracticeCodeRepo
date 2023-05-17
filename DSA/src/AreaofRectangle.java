import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length = in.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = in.nextDouble();
        double area = length * breadth;
        System.out.println("Area of the rectangle:" + area);
    }
}
