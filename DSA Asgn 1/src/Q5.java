import java.util.Scanner;

public class Q5 {
    public static int sum_Of_Digits(int num) {
        while (num > 9) {
            int count = 0;
            int sum = num;
            while (sum > 0) {
                int digit = sum % 10;
                count += digit;
                sum /= 10;
            }
            num = count;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = dk.nextInt();
        System.out.println("Sum of digits of "+ n + " until the number is a single digit is: "+ sum_Of_Digits(n));

    }
}
