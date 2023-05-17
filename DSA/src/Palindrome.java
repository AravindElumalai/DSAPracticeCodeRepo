import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the String to check palindrome::");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String palindromeString = "";
        char[] string2Array = userInput.toCharArray();
        for (int i = string2Array.length - 1; i >= 0; i--) {
            palindromeString = palindromeString + string2Array[i];
            System.out.println("PalindromeString:::" + palindromeString);
        }
        if (userInput.equals(palindromeString)) {
            System.out.println("the given string is palindrome");
        } else {
            System.out.println("The given string is not palindrome");
        }
    }
}