import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of nos to find average:");
        int numLimit = in.nextInt();
        int sum = 0;
        for (int i = 0; i < numLimit; i++) {
            int num = in.nextInt();
            sum = sum + num;

        }
        double avg = sum / numLimit;
        System.out.println("Avg::" + avg);
    }
}
