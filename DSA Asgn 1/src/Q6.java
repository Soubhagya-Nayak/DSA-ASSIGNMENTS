import java.util.Scanner;

public class Q6 {
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
    public static void main(String[] args) {
        Scanner  dk = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = dk.nextInt();
        System.out.println(num + " is odd: " + isOdd(num));
    }
}
