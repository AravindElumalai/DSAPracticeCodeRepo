import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the age to check you have voting rights::");
        int age = in.nextInt();
        boolean check = isAgeRighttoVote(age);
        System.out.println("Is the person eligible to vote::" + check);
    }

    static boolean isAgeRighttoVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
