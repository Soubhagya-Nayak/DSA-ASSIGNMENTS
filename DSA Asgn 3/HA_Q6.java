import java.util.Scanner;

public class HA_Q6 {
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Not a palindrome
        }
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.println("Enter the sentence you want to know that is palindrome or not: ");
        String input = dk.nextLine(); 
        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("Yes, it's a palindrome!");
        } else {
            System.out.println("No, it's not a palindrome.");
        }
    }
}
