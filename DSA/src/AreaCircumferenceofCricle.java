import java.util.Scanner;

public class AreaCircumferenceofCricle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the area of circle");
        double radius = in.nextDouble();
        double area = areaCircle(radius);
        double circumference = circumferenceCircle(radius);
        System.out.println("Area of circle:" + area);
        System.out.println("Circumference of circle:" + circumference);
    }

    static double areaCircle(double radius) {
        return 3.14 * radius * radius;
    }

    static double circumferenceCircle(double radius) {
        return 2 * 3.14 * radius;
    }
}