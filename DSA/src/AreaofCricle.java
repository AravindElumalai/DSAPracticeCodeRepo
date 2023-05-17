import java.util.Scanner;

public class AreaofCricle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the area of circle");
        double radius = in.nextDouble();
        radius = 3.14 * radius * radius;
        System.out.println("Area of circle:" + radius);
    }
}